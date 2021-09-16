package com.example.formulario;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowDataActivity extends AppCompatActivity {

    private TextView tvNombre, tvLenguajes, tvLenguajeFav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        tvNombre = (TextView) findViewById(R.id.tv1);
        String dato = getIntent().getStringExtra("Nombres:");
        tvNombre.setText("Nombre Completo: " + dato);

        tvLenguajes = (TextView) findViewById(R.id.tv2);
        String dato2 = getIntent().getStringExtra("Lenguajes");
        tvLenguajes.setText("Lenguajes que maneja:" + dato2);

        tvLenguajeFav = (TextView) findViewById(R.id.tv3);
        String dato3 = getIntent().getStringExtra("LenguajePreferido");
        tvLenguajeFav.setText("Lenguaje favorito:" + dato3);
    }

    public void volver(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }

}
