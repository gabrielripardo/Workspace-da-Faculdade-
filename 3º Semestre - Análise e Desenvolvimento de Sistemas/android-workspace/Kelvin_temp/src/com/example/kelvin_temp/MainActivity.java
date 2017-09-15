package com.example.kelvin_temp;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {
	EditText celciuEdit;
	Button conv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		celciuEdit = (EditText) findViewById(R.id._CtoK);
		conv = (Button) findViewById(R.id._Conv);
		
		conv.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				String celciuStr = celciuEdit.getText().toString(); // Convert o eddited para String, facilitando a manipulação.
				int celsius = Integer.parseInt(celciuStr);
				
				int kelvin = celsius + 273; // Fórmula para converter o valor Celsius para kelvin
				
				AlertDialog.Builder rslAlert = new AlertDialog.Builder (MainActivity.this);
				rslAlert.setTitle("Conversão");
				rslAlert.setMessage(celciuStr + "º = " + kelvin + " K \n Escalada Celsius para Kelvin");
				rslAlert.setNeutralButton("OK", null);
				rslAlert.show();
			}
		});
	}
}
