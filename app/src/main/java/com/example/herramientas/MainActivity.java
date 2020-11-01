package com.example.herramientas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ComunicaMenu{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void menu(int queboton) { //En queBoton ya tenemos almacenado el boton pulsado, esa info nos llega desde el MenuFragment

        Intent intent = new Intent(this, HerramientasActivity.class);

        intent.putExtra("BOTONPULSADO", queboton);

        startActivity(intent);
    }
}