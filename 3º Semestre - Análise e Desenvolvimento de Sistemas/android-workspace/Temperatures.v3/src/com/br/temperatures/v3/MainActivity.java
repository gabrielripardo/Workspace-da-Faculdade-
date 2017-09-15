package com.br.temperatures.v3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {
	EditText valEdit;
	Button transf;
	TextView rsl;
	RadioGroup option;
	
	public void telaPrincipal(){
		setContentView(R.layout.activity_main);
		
		Button cels;
		Button kelv;
		Button fare;
		
		cels = (Button) findViewById(R.id._Celsius);
		kelv = (Button) findViewById(R.id._Kelvin);
		fare = (Button) findViewById(R.id._Farenheit);
		
		cels.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				celsiusTela();
			}
		});
		
		kelv.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				kelvinTela();
			}
		});
		
		fare.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				farenheitTela();
			}
		});
	}
	
	
	// Conversão Farenheit
	public void farenheitTela(){
		setContentView(R.layout.farenheit);
	
		valEdit = (EditText) findViewById(R.id._Fare);
		transf = (Button) findViewById(R.id._Conv);
		rsl = (TextView) findViewById(R.id._Rsl);
		option =(RadioGroup) findViewById(R.id._Escalas);
		
		transf.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {

				String farStr = valEdit.getText().toString();
				double farInt = Float.parseFloat(farStr);
				
				double celc = (farInt - 32) / 1.8;
				double kelv = celc + 273; 
				double result;
				String escala;
				int var = option.getCheckedRadioButtonId();
				
				if (var == R.id._Cel){
					result = celc;
					escala = "C";
				}else {
					result = kelv;
					escala = "K";
				}
				rsl.setText(farStr + "F" + " = " + Double.toString(result) + escala);
			}
		});	
	}
	
	// Conversão - Base Celsius
	public void celsiusTela(){
		setContentView(R.layout.celsius);
		
		valEdit = (EditText) findViewById(R.id._Cels);
		transf = (Button) findViewById(R.id._Conv);
		rsl = (TextView) findViewById(R.id._Rsl);
		option = (RadioGroup) findViewById(R.id._Escalas);
		
		transf.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String celStr = valEdit.getText().toString();
				int celInt = Integer.parseInt(celStr);
				
				double kelv = celInt + 273; 
				double fare = (celInt + 32) * 1.8;
				
				double result;
				String escala;
				
				int radio = option.getCheckedRadioButtonId();
				
				if (radio == R.id._Kelvin){
					result = kelv;
					escala = "K";
				}else{
					result = fare;
					escala = "F";
				}
				rsl.setText(celStr + "F" + " = " + Double.toString(result) + escala);
			}
		});
	}
	
	// Conversão - Base Kelvin
	public void kelvinTela(){
		setContentView(R.layout.kelvin);
		
		
	}
	
	// Método Principal
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		telaPrincipal();
	}
}
// Tratamento de exceção para que quando o valor inserido for branco não fechar o app e sim retornar uma mensagem de aviso para preencher o campo com um número



