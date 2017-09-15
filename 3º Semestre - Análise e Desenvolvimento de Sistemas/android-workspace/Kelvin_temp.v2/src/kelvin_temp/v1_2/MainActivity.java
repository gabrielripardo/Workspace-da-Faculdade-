package kelvin_temp.v1_2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import kelvin_temp.v1.R;
import android.view.View;

public class MainActivity extends Activity {
	EditText valEdit;
	Button calc;
	TextView rsl;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		valEdit = (EditText) findViewById(R.id._valor);
		calc = (Button) findViewById(R.id._Conv);
		rsl = (TextView) findViewById(R.id._Resultado);
		
		calc.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {

				String valStr = valEdit.getText().toString();
				int val = Integer.parseInt(valStr);
				
				RadioGroup temp = (RadioGroup) findViewById(R.id.rgoptions);
				int op = temp.getCheckedRadioButtonId();
				
				int formula;
				String escala;
				String toescl;
					
				if(op == R.id._Kelvin){ // Celsius para Kelvin
					formula = val + 273;
					escala = "ºC";
					toescl = "K";
				}else{ // Kelvin para Celsius
					formula = val - 273;
					escala = "ºK";
					toescl = "ºC";
				}
				String formlStr = Integer.toString(formula);
				
				rsl.setText("");
				rsl.setText(valStr + escala + " = " + formlStr + toescl);
			}
		});
	}
}
