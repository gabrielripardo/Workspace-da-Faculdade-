package dfbusitinerary.developer.com.dfbusitinerary;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ServicosActivity extends Activity {

    private Button botaoListaTarefas;
    private Button botaoMinhasAnotacoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicos);

        botaoListaTarefas = (Button) findViewById(R.id.botaoListaTarefasId);
        botaoMinhasAnotacoes = (Button) findViewById(R.id.botaoMinhasAnotacoesId);

        botaoListaTarefas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ServicosActivity.this, ListaTarefasActivity.class));
            }
        });

        botaoMinhasAnotacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ServicosActivity.this, MinhasAnotacoesActivity.class));
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
