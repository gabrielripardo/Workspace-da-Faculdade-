package dfbusitinerary.developer.com.dfbusitinerary;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends Activity {

    private ImageView botaoContato;
    private ImageView botaoItinerario;
    private ImageView botaoInformacoes;
    private ImageView botaoServicos;
    private TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoContato = (ImageView) findViewById(R.id.imageViewContatoId);
        botaoItinerario = (ImageView) findViewById(R.id.imageViewItinerarioId);
        botaoInformacoes = (ImageView) findViewById(R.id.imageViewInformacoesId);
        botaoServicos = (ImageView) findViewById(R.id.imageViewServicosId);
        data = (TextView) findViewById(R.id.dataId);

        DateFormat relogioFormatado = new SimpleDateFormat("dd/MM/yyyy");
        Date relogio = new Date();
        data.setText(relogioFormatado.format(relogio));

        botaoContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ContatoActivity.class));
            }
        });

        botaoItinerario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ItinerarioActivity.class));
            }
        });

        botaoInformacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, InformacoesActivity.class));
            }
        });

        botaoServicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ServicosActivity.class));
            }
        });
    }
}
