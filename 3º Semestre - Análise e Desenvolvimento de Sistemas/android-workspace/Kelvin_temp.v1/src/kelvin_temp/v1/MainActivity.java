package kelvin_temp.v1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class MainActivity extends Activity {
	EditText valEdit;
	Button calc;
	TextView rsl;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		valEdit = (EditText) findViewById(R.id._CtoK);
		calc = (Button) findViewById(R.id._Conv);
		rsl = (TextView) findViewById(R.id._Resultado);
		
		calc.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String celsiStr = valEdit.getText().toString();
				int celsius = Integer.parseInt(celsiStr);
				
				int formula = celsius + 273;
				
				String formlStr = Integer.toString(formula);
				
				rsl.setText("");
				rsl.setText(celsiStr + "º C = " + formlStr + " K");
			}
		});
	}
}
