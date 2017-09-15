package dfbusitinerary.developer.com.dfbusitinerary;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListaTarefasActivity extends Activity {

    // Atributos para componentes da interface
    private EditText textoTarefa;
    private Button botaoAdicionar;
    private ListView listarTarefas;

    // Atributo para Banco de Dados
    private SQLiteDatabase bancoDados;

    // Atributo para ListView integração com banco
    private ArrayAdapter<String> itensAdaptador;
    private ArrayList<String> itens;
    private ArrayList<Integer> ids;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_tarefas);



        try {
            // recuperar componentes da tela
            textoTarefa = (EditText) findViewById(R.id.textoId);
            botaoAdicionar = (Button) findViewById(R.id.botaoAdicionarId);

            // Lista
            listarTarefas = (ListView) findViewById(R.id.listViewId);

            // Banco de Dados SQLite
            bancoDados = openOrCreateDatabase("apptarefas", MODE_PRIVATE, null);

            // Tabela Tarefas
            bancoDados.execSQL("CREATE TABLE IF NOT EXISTS tarefas(id INTEGER PRIMARY KEY AUTOINCREMENT, tarefa VARCHAR)");

            // Evento de OnClick para salvar(adicionar) as tarefas no ListView
            botaoAdicionar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    // Recuperar o texto digitado e inserir no Banco de Dados
                    String textoDigitado = textoTarefa.getText().toString();
                    salvarTarefa(textoDigitado);
                }
            });

            // SEGURAR ALGUNS SEGUNDOS PARA REMOVER
            listarTarefas.setLongClickable(true);
            listarTarefas.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
                @Override
                public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                    removerTarefa(ids.get(position));
                    return true;
                }
            });

            // REMOVER APENAS COM UM CLIQUE
            /*listarTarefas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    removerTarefa(ids.get(position));
                }
            });*/

            //Recuperar tarefas
            recuperarTarefas();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    private void salvarTarefa(String texto) {

        try {
            if (texto.equals("")) {
                Toast.makeText(ListaTarefasActivity.this, "Digite uma nova tarefa!", Toast.LENGTH_SHORT).show();
            } else {
                bancoDados.execSQL("INSERT INTO tarefas (tarefa) VALUES(' " + texto + " ')");
                Toast.makeText(ListaTarefasActivity.this, "Tarefa salva com sucesso!", Toast.LENGTH_SHORT).show();
                recuperarTarefas();
                textoTarefa.setText("");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    private void recuperarTarefas() {

        try {
            // Recupera as tarefas
            Cursor cursor = bancoDados.rawQuery("SELECT * FROM tarefas ORDER BY id DESC", null);

            // Recuperar os id's das colunas
            int indiceColunaId = cursor.getColumnIndex("id");
            int indiceColunaTarefa = cursor.getColumnIndex("tarefa");

            // Criar o adaptador
            itens = new ArrayList<String>();
            ids = new ArrayList<Integer>();
            itensAdaptador = new ArrayAdapter<String>(getApplicationContext(),
                    android.R.layout.simple_list_item_2,
                    android.R.id.text2,
                    itens);
            listarTarefas.setAdapter(itensAdaptador);

            // Listar as tarefas
            cursor.moveToFirst();
            while (cursor != null) {

                Log.i("Resultado - ", "Id tarefa: " + cursor.getString(indiceColunaId) + " Tarefa: " + cursor.getString(indiceColunaTarefa));
                itens.add(cursor.getString(indiceColunaTarefa));
                ids.add(Integer.parseInt(cursor.getString(indiceColunaId)));
                cursor.moveToNext();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    private void removerTarefa(Integer id) {
        try {
            bancoDados.execSQL("DELETE FROM tarefas WHERE id="+id);
            recuperarTarefas();
            Toast.makeText(ListaTarefasActivity.this, "Tarefa removida com sucesso!", Toast.LENGTH_SHORT).show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}