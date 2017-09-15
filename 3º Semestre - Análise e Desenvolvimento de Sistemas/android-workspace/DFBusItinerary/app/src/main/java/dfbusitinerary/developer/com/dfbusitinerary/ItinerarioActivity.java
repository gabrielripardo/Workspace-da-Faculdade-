package dfbusitinerary.developer.com.dfbusitinerary;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ItinerarioActivity extends Activity {

    private ListView listaItens;
    private String[] itens = {
            "1 - Pioneira", "2 - Marechal", "3 - São José",
            "4 - Piracicabana", "5 - Aguardando Wagner...", "6 - Aguardando Wagner...",
            "7 - Aguardando Wagner...", "8 - Aguardando Wagner...", "9 - Aguardando Wagner...",
            "10 - Aguardando Wagner...", "11 - Aguardando Wagner...",
            "12 - Aguardando Wagner...", "13 - Aguardando Wagner..."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerario);
        listaItens = (ListView) findViewById(R.id.listViewId);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        listaItens.setAdapter(adaptador);

        listaItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int codigoPosicao = position;
                String valorClicado = listaItens.getItemAtPosition(codigoPosicao).toString();
                Toast.makeText(getApplicationContext(), valorClicado, Toast.LENGTH_SHORT).show();

                if (valorClicado.equals("1 - Pioneira")) {
                    startActivity(new Intent(ItinerarioActivity.this, PioneiraActivity.class));
                } else if (valorClicado.equals("2 - Marechal")) {
                    startActivity(new Intent(ItinerarioActivity.this, MarechalActivity.class));
                } else if (valorClicado.equals("3 - São José")) {
                    startActivity(new Intent(ItinerarioActivity.this, SaoJoseActivity.class));
                } else if (valorClicado.equals("4 - Piracicabana")) {
                    startActivity(new Intent(ItinerarioActivity.this, PiracicabanaActivity.class));
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        //Toast.makeText(getApplicationContext(), "onStart método chamado", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //Toast.makeText(getApplicationContext(), "onRestar método chamado", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Toast.makeText(getApplicationContext(), "onResume método chamado", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Toast.makeText(getApplicationContext(), "onPause método chamado", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //Toast.makeText(getApplicationContext(), "onStop método chamado", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Toast.makeText(getApplicationContext(), "onDestroy método chamado", Toast.LENGTH_SHORT).show();
    }
}
