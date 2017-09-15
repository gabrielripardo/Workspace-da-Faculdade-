package com.ulh;

import java.util.Random;

import com.ulh.R;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.UpdateAppearance;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ProgressBar;
import android.widget.TextView;



@SuppressLint("ClickableViewAccessibility") @SuppressWarnings("unused")
public class GameView extends View implements Runnable 
{
	
	private static final int INTERVAL = 50;
	
	private static final int IMAGE_TYPE_BONUS=1;
	private static final int IMAGE_TYPE_SUJEIRA=2;
	
	
	private boolean running = true;
	private int y;
	private Paint paint;
	private Inimigo[] inimigos;
	
	private Canvas myCanvas;
	
	
	private Bitmap estante;
	private Bitmap cerveja;
	private Bitmap gotinha;
	
	private Bitmap pneu;
	private Bitmap tv;
	private Bitmap robo;
	private Bitmap pc_antigo;
	private Bitmap garrafas;
	private Bitmap cloro;
	
	private Bitmap estrela;
	private Bitmap estrela_branca;
	
	
	private Bitmap bom_msg;
	private Bitmap mal_msg;
	
	private Bitmap background;
	private Bitmap background1;
	private Bitmap background2;
	private Bitmap background3;
	private Bitmap background4;
	private Bitmap background5;

	
	private int sujeira;
	
			
	public GameView(Context context) 
	{
		super(context);
		
		this.estante = BitmapFactory.decodeResource(context.getResources(), R.drawable.estante);
		this.cerveja = BitmapFactory.decodeResource(context.getResources(), R.drawable.cerveja);
		this.gotinha = BitmapFactory.decodeResource(context.getResources(), R.drawable.gotinha);
		this.pneu = BitmapFactory.decodeResource(context.getResources(), R.drawable.pneu);
		this.tv = BitmapFactory.decodeResource(context.getResources(), R.drawable.tv);
		this.robo = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_launcher_android);
		this.pc_antigo = BitmapFactory.decodeResource(context.getResources(), R.drawable.pc_old);
		this.garrafas = BitmapFactory.decodeResource(context.getResources(), R.drawable.garrafas);
		this.cloro = BitmapFactory.decodeResource(context.getResources(), R.drawable.cloro);
		
		this.estrela = BitmapFactory.decodeResource(context.getResources(), R.drawable.estrelinha);
		this.estrela_branca = BitmapFactory.decodeResource(context.getResources(), R.drawable.estrelinha_branca);
		
		this.background = BitmapFactory.decodeResource(context.getResources(), R.drawable.background);
		this.background1 = BitmapFactory.decodeResource(context.getResources(), R.drawable.background1);
		this.background2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.background2);
		this.background3 = BitmapFactory.decodeResource(context.getResources(), R.drawable.background3);
		this.background4 = BitmapFactory.decodeResource(context.getResources(), R.drawable.background4);
		this.background5 = BitmapFactory.decodeResource(context.getResources(), R.drawable.background5);
		
		
		this.bom_msg = BitmapFactory.decodeResource(context.getResources(), R.drawable.bom);
		this.mal_msg = BitmapFactory.decodeResource(context.getResources(), R.drawable.mal);
		
		this.sujeira = 0;
		
		
		paint = new Paint();
		Thread minhaThread = new Thread(this);
		minhaThread.setPriority(Thread.MIN_PRIORITY);
		minhaThread.start();
	}

	@Override
	public void run() 
	{
		while(running)
		{
			try 
			{
				Thread.sleep(INTERVAL);
			} 
			catch (Exception e) 
			{
				Log.e("ERRO", e.getMessage());
			}
		}   update();
		
	}
	
	private void update()
	{
		if(inimigos==null)
		{
			return;
		}
		
		
		for (int i = 0; i < inimigos.length; i++) 
		{
			inimigos[i].mexe(getWidth(), getHeight());
			
		}
		
		postInvalidate(); //dispara o metodo draw para desenhar.
	}
	
	public void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
		myCanvas = canvas;
		
		if(inimigos==null)
		{
			iniciaJogo();
		}
		
		for (int i = 0; i < inimigos.length; i++) 
		{
			if( inimigos[i].getY() == -5 && inimigos[i].getType() == IMAGE_TYPE_SUJEIRA)
			{
				if(sujeira<30)
					sujeira++;
			}
			
			inimigos[i].mexe(getWidth(), getHeight());
			
		}
		
		updateLevel();
		
		
		for (int i = 0; i <inimigos.length; i++) 
		{
			inimigos[i].draw(canvas, paint);
		}
		
		invalidate();
	}
	
	public void release()
	{
		running = false;
	}
	
	public void iniciaJogo()
	{
		inimigos = new Inimigo[9];
		
		for (int i = 0; i < inimigos.length; i++) 
		{
			int y = i * 50;
			int x = (int)(Math.random()*(getWidth()-25));
			
			Random r = new Random();
			int Low = 1;
			int High = 8;

			switch (i) 
			{
			  case 1: //Estante
				  inimigos[i] = new Inimigo(x, y,IMAGE_TYPE_SUJEIRA,3,estante);
			  break;
			  
			  case 2:  //PC Antigo
				  inimigos[i] = new Inimigo(x, y,IMAGE_TYPE_SUJEIRA,1,pc_antigo);
			  break;
			  
			  case 3:  //Cerveja
				  inimigos[i] = new Inimigo(x, y,IMAGE_TYPE_SUJEIRA,2,cerveja);
			  break;
			  			  
			  case 4:  //Gotinha
				  inimigos[i] = new Inimigo(x, y,IMAGE_TYPE_BONUS,4,gotinha);
			  break;
			  			  
			  case 5:  //Pneu
				  inimigos[i] = new Inimigo(x, y,IMAGE_TYPE_SUJEIRA,5,pneu);
			  break;
			  
			  case 6:  //Tv
				  inimigos[i] = new Inimigo(x, y,IMAGE_TYPE_SUJEIRA,1,tv);
			  break;
			  
			  case 7:  //robo
				  inimigos[i] = new Inimigo(x, y,IMAGE_TYPE_BONUS,2,robo);
			  break;
			  
			  case 8:  //Garrafas
				  inimigos[i] = new Inimigo(x, y,IMAGE_TYPE_SUJEIRA,2,garrafas);
			  break;
			  
			  default: //Cloro
				  inimigos[i] = new Inimigo(x, y,IMAGE_TYPE_BONUS,2,cloro);
			  break;
			}
			
		}
	}
	
	public boolean onTouchEvent(MotionEvent event)
	{
		if(event.getAction()== MotionEvent.ACTION_DOWN)
		{
			int x =(int)event.getX();
			int y =(int) event.getY();
			
			for (int i = 0; i < inimigos.length; i++) 
			{
				if(inimigos[i].colide(x, y))
				{
					if(sujeira>0)
						sujeira--;
					
					inimigos[i].setX(-200);
					inimigos[i].setY(getHeight()+5);
				}
			}
			
		}
		
		return super.onTouchEvent(event);
	}
	
	
	
	public void updateLevel()
	{
		
		Rect dest = new Rect(0, 0, getWidth(), getHeight());
		Paint paint = new Paint();
		paint.setFilterBitmap(true);
		
		
		
		if (sujeira >=0 && sujeira <=5)
		{
			myCanvas.drawBitmap(background, null, dest, paint);
			myCanvas.drawBitmap(estrela, 0, 0, null);
			myCanvas.drawBitmap(estrela, 100, 0, null);
			myCanvas.drawBitmap(estrela, 200, 0, null);
			myCanvas.drawBitmap(estrela, 300, 0, null);
			myCanvas.drawBitmap(estrela, 400, 0, null);
			myCanvas.drawBitmap(bom_msg, 500, 0, null);
			
			
		}
		
		if (sujeira >5 && sujeira <=10)
		{
			myCanvas.drawBitmap(background1, null, dest, paint);
			myCanvas.drawBitmap(estrela, 0, 0, null);
			myCanvas.drawBitmap(estrela, 100, 0, null);
			myCanvas.drawBitmap(estrela, 200, 0, null);
			myCanvas.drawBitmap(estrela, 300, 0, null);
			myCanvas.drawBitmap(estrela_branca, 400, 0, null);
			myCanvas.drawBitmap(bom_msg, 500, 0, null);
		}
		
		if (sujeira >10 && sujeira <=15)
		{
			myCanvas.drawBitmap(background2, null, dest, paint);
			myCanvas.drawBitmap(estrela, 0, 0, null);
			myCanvas.drawBitmap(estrela, 100, 0, null);
			myCanvas.drawBitmap(estrela, 200, 0, null);
			myCanvas.drawBitmap(estrela_branca, 300, 0, null);
			myCanvas.drawBitmap(estrela_branca, 400, 0, null);
			myCanvas.drawBitmap(bom_msg, 500, 0, null);
		}
		
		if (sujeira >15 && sujeira <=20)
		{
			myCanvas.drawBitmap(background3, null, dest, paint);
			myCanvas.drawBitmap(estrela, 0, 0, null);
			myCanvas.drawBitmap(estrela, 100, 0, null);
			myCanvas.drawBitmap(estrela_branca, 200, 0, null);
			myCanvas.drawBitmap(estrela_branca, 300, 0, null);
			myCanvas.drawBitmap(estrela_branca, 400, 0, null);
			myCanvas.drawBitmap(mal_msg, 500, 0, null);
		}
		
		if (sujeira >20 && sujeira <=25)
		{
			myCanvas.drawBitmap(background4, null, dest, paint);
			myCanvas.drawBitmap(estrela, 0, 0, null);
			myCanvas.drawBitmap(estrela_branca, 100, 0, null);
			myCanvas.drawBitmap(estrela_branca, 200, 0, null);
			myCanvas.drawBitmap(estrela_branca, 300, 0, null);
			myCanvas.drawBitmap(estrela_branca, 400, 0, null);
			myCanvas.drawBitmap(mal_msg, 500, 0, null);
		}
		
		
		if (sujeira >25 && sujeira <=30)
		{
			myCanvas.drawBitmap(background5, null, dest, paint);
			myCanvas.drawBitmap(estrela_branca, 0, 0, null);
			myCanvas.drawBitmap(estrela_branca, 100, 0, null);
			myCanvas.drawBitmap(estrela_branca, 200, 0, null);
			myCanvas.drawBitmap(estrela_branca, 300, 0, null);
			myCanvas.drawBitmap(estrela_branca, 400, 0, null);
			myCanvas.drawBitmap(mal_msg, 500, 10, null);
			sujeira = 0;
		}	
	}
}
