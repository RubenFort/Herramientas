package com.example.herramientas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.os.Bundle;

public class HerramientasActivity extends Activity implements ComunicaMenu{

    Fragment [] misFragmentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herramientas);

        misFragmentos = new Fragment[3];
        //No se pq no funciona
        /*misFragmentos[0] = new LinternaFragment();
        misFragmentos[1] = new MusicaFragment();
        misFragmentos[2] = new NivelFragment();*/
        misFragmentos[0] = new Fragment();
        misFragmentos[1] = new Fragment();
        misFragmentos[2] = new Fragment();

        Bundle extras = getIntent().getExtras();

        menu(extras.getInt("BOTONPULSADO"));
    }

    @Override
    public void menu(int queboton) {

        FragmentManager miManejador = getFragmentManager();

        FragmentTransaction miTransaccion = miManejador.beginTransaction();

        miTransaccion.replace(R.id.herramientas, misFragmentos[queboton]);

        miTransaccion.commit();
    }
}