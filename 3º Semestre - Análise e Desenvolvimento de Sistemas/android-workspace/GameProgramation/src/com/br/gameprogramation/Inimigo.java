package com.br.gameprogramation;

import android.graphics.Bitmap;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

public class Inimigo extends Retangulo {
	  private Bitmap bm;
	  private int type;
	  private int velocity=1;
	  
	  public Inimigo(int x,int y, int typeInimigo, int velocity, Bitmap bitmap)
	  {
	    super(x,y,50,50);
	    this.type = typeInimigo;
	    this.bm = bitmap;
	    
	    switch (this.type) 
	    {
	      case 1: //Bonus
	  	    this.velocity=velocity;
	  	    setWidth(80); // muda a largura
	  	    setHeight(80); // muda a altura
	      break;
	      
	      case 2: //Sujeira 
	  	    this.velocity=velocity;
	  	    setWidth(80);
	  	    setHeight(80);
	      break;
	      
	      default: //Retangulo Amarelo
	  	    this.velocity=velocity;
	  	    setWidth(50);
	  	    setHeight(50);
	      break;
	    }
	  }
	  public int getType() 
	  {
	    return type;
	  }
	  public void mexe(int w, int h)
	  {
	    if (getY()<h) // vai descendo
	    {
	      setY(getY()+1*velocity);
	    }
	    else // caiu
	    {
	      int x = (int)(Math.random()*(w-25)); //Calcular um numero aleatorio.
	      setX(x);
	      
	      if(getY()==h+5)
	      {
	        setY(-3);
	      }
	      else
	      {
	        setY(-5);
	      }
	    }
	  }
	  public void draw (Canvas canvas,Paint paint) // Canvas é o quadro que será desenhado pelo paint
	  {
	    Rect dest = new Rect(getX(), getY(), getX()+getWidth(), getY()+getHeight());

	    switch (this.type) 
	    {
	      case 1: //Imagem
	      paint.setFilterBitmap(true);
	      canvas.drawBitmap(this.bm, null, dest, paint);
	      break;

	      case 2: //Sujeira
	      paint.setFilterBitmap(true);
	      canvas.drawBitmap(this.bm, null, dest, paint);
	      break;

	      default: //Retangle
	      paint.setColor(Color.YELLOW);
	      canvas.drawRect(getX(), getY(), getX()+getWidth(), getY()+getHeight(), paint);  	
	      break;
	    }
	  }
}







