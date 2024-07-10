package br.edu.unicarioca.trocatelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        Intent intent = getIntent();

        String informacao = intent.getStringExtra("info");

        TextView destino = (TextView)findViewById(R.id.destino);
        destino.setText(informacao);
    }
}