package com.andreszapata.appsegclas;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class calculadora extends AppCompatActivity {

    String Tag = "Prueba";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_inicio);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag,"Estoy en OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag,"Estoy en OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag,"Estoy en OnStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Tag,"Estoy en OnRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag,"Estoy en OnDestroy");
    }
}

