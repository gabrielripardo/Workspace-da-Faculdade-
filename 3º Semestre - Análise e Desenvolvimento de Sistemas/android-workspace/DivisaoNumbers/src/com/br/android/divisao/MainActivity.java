package com.br.android.divisao;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MainActivity extends Activity {
	Button botao; //Testar depois com o private
	EditText val1;
	EditText val2;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		val1 = (EditText) findViewById(R.id.num1);
		val2 = (EditText) findViewById(R.id.num2);
		botao = (Button) findViewById(R.id.btnDividir);
		
		botao.setOnClickListener(new View.OnClickListener(){
			
			public void onClick(View v){
				String myStr1 = val1.getText().toString(); // Convertendo Editable para String
				String myStr2 = val2.getText().toString(); // Convertendo Editable para String 
				
				double dividendo = Double.parseDouble(myStr1); // Converte String para Double
				double divisor = Double.parseDouble(myStr2); // // Converte String para Double
				double divisao = (double) dividendo / divisor;
			
					
				AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);// Instanciado uma caixa de diálogo simples
				
				msg.setTitle("Resultado:"); // Título de diálogo
				msg.setMessage("Divisão = " + divisao); // Conteúdo do diálogo
				msg.setNeutralButton("OK", null);	// Gerando o botão para retornar a interface padrão 
				msg.show();// Mostar o diálogo com todas informações setadas
			}	
		});
	}
}
