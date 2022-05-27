package com.example.aplicacaoteste;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.w3c.dom.Text;

public class alarme extends AppCompatActivity {

    public static final String EXTRA_MESSAGE ="com.example.aplicacaoteste" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarme);
    }

    public void  irTelaPrincipal(View view){
        Intent salvar = new Intent(this,MainActivity.class);
        EditText text = (EditText) findViewById(R.id.editTextTime2);
        String nome = text.getText().toString();
        salvar.putExtra(EXTRA_MESSAGE, nome);
        startActivity(salvar);
    }
    public void desafios(View view){
        Intent irdesafios = new Intent(this, Desafios.class);
        startActivity(irdesafios);
    }
}