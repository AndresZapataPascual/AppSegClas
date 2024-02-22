package com.andreszapata.appsegclas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PantallaTwo extends AppCompatActivity{

    TextView usuarioDos, textoAnterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_two2);
        usuarioDos = findViewById(R.id.usuarioDos);
        textoAnterior = findViewById(R.id.textoAnterior);

        String name = getIntent().getStringExtra("name");
        usuarioDos.setText(name);

    }

    @Override
    protected void onResume(){
        super.onResume();
        setContentView(R.layout.activity_pantalla_two2);
        usuarioDos = findViewById(R.id.usuarioDos);
        textoAnterior = findViewById(R.id.textoAnterior);

        String name = getIntent().getStringExtra("name");
        usuarioDos.setText(name);
    }
}
