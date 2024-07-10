package br.edu.unicarioca.trocatelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBotao(View v){
        EditText origem = (EditText) findViewById(R.id.origem);
        String informacao = origem.getText().toString();

        Intent intent = new Intent(this, Tela2.class);
        intent.putExtra("info", informacao);
        startActivity(intent);

        finish();
    }
}