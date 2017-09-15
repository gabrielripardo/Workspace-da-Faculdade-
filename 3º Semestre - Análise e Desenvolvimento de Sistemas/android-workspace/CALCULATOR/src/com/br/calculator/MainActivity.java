package com.br.calculator;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.*;

import android.widget.*;

public class MainActivity extends Activity implements View.OnClickListener {

	private EditText edtValor1;
	private EditText edtValor2;
	private Button btnCalcular;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		edtValor1 = (EditText)findViewById(R.id.edtValor1);
		edtValor2 = (EditText)findViewById(R.id.edtValor2);
		btnCalcular = (Button)findViewById(R.id.btnCalcular); 

		
		btnCalcular.setOnClickListener(this);
	}

	public void onClick(View v){
		
		String v1 = edtValor1.getText().toString();
		String v2 = edtValor2.getText().toString();
		
		if (v1.trim().isEmpty() || v2.trim().isEmpty()){
			AlertDialog.Builder dlg = new AlertDialog.Builder(this);
			dlg.setMessage("Há espaços em branco");
			dlg.setNeutralButton("Ok" , null);
			dlg.show();
		}
		else{
		
		
		double valor1 = Double.parseDouble(edtValor1.getText().toString());
		double valor2 = Double.parseDouble(edtValor2.getText().toString());
		
		double resultado = valor1 + valor2;
		
		AlertDialog.Builder dlg = new AlertDialog.Builder(this);
		dlg.setMessage("Resultado = " + resultado);
		dlg.setNeutralButton("Ok" , null);
		dlg.show();
		}		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
