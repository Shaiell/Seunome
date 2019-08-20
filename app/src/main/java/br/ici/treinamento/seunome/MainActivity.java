package br.ici.treinamento.seunome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void mensagemteste (View view){

        TextView nome = (TextView) findViewById(R.id.editTextNome);

        Toast.makeText(MainActivity.this,"Olá "+nome.getText().toString()+" !!!", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
