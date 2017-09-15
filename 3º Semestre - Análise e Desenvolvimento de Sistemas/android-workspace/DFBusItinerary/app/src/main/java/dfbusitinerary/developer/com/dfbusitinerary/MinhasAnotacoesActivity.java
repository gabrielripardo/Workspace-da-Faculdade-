package dfbusitinerary.developer.com.dfbusitinerary;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MinhasAnotacoesActivity extends Activity { // classe pública MainActivity (tela principal) que estende a classe Activity;

    private EditText texto; // atributo texto privado do tipo EditText;
    private ImageView botaoSalvar; // atributo botaoSalvar privado do tipo ImageView;
    private static final String NOME_ARQUIVO = "arquivo_anotacao.txt";
    // CONSTANTE NOME_ARQUIVO privada, estática e final do tipo String que recebe o valor "arquivo_anotacao.txt" (nome do arquivo que irá salvar os textos);

    @Override // método principal onCreate
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minhas_anotacoes);

        texto = (EditText) findViewById(R.id.textoId);
        botaoSalvar = (ImageView) findViewById(R.id.botaoSalvarId);

        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textoDigitado = texto.getText().toString();
                gravarNoArquivo(textoDigitado);
                Toast.makeText(MinhasAnotacoesActivity.this, "Anotação salva com sucesso!", Toast.LENGTH_SHORT).show();
            }
        });

        // recuperar o que foi gravado
        if(lerArquivo() != null) {
            texto.setText(lerArquivo());
        }
    }

    private void gravarNoArquivo(String texto) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openFileOutput(NOME_ARQUIVO, Context.MODE_PRIVATE));
            outputStreamWriter.write(texto);
            outputStreamWriter.close();
        } catch(IOException e) {
            Log.v("MainActivity", e.toString());
        }
    }

    private String lerArquivo() {

        String resultado = "";

        try {
            //Abrir arquivo
            InputStream arquivo = openFileInput(NOME_ARQUIVO);
            if(arquivo != null) {
                // ler o arquivo
                InputStreamReader inputStreamReader = new InputStreamReader(arquivo);
                // gerar BUFFER do arquivo lido
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                // recuperar os textos do arquivo
                String linhaArquivo = "";
                while((linhaArquivo = bufferedReader.readLine()) != null) {
                    resultado += linhaArquivo + "\n";
                }
                arquivo.close();
            }
        } catch(IOException e) {
            Log.v("MainActivity", e.toString());
        }
        return resultado;
    }
}