package matc89.exercicio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button buttonRemover;
    private Button buttonAdicionar;
    private EditText editTextDescricao;
    private EditText editTextPrioridade;
    private ListView listView;
    private List<Tarefa> tarefas = new ArrayList<Tarefa>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdicionar = (Button)findViewById(R.id.buttonAdicionar);
        buttonRemover = (Button)findViewById(R.id.buttonRemover);
        editTextDescricao = (EditText)findViewById(R.id.editDescricao);
        editTextPrioridade = (EditText) findViewById(R.id.editPrioridade);
        listView = (ListView) findViewById(R.id.listView);
    }

    // Função do botão adicionar
    public void clicouAdicionar(View v) {
        String textoDescricao = editTextDescricao.getText().toString();
        int prioridade = Integer.parseInt(editTextPrioridade.getText().toString());

        // Validando dados
        if(prioridade < 1 || prioridade > 10) {
            Toast.makeText(getApplicationContext(),"A prioridade deve estar entre 1 e 10.", Toast.LENGTH_SHORT).show();
        } else {
            
        }

        System.out.println("Descrição: " +textoDescricao);
        System.out.println("Prioridade: " +prioridade);
    }
}
