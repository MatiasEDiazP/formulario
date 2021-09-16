package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView nombres, apellidos;

    private EditText campo1, campo2;

    private CheckBox chkJava, chkPhp,chkPython, chkCsharp, chkCplus;

    private RadioButton rJava, rPhp, rPython, rCsharp, rCplus;

    private Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombres = (TextView) findViewById(R.id.txtNombres);
        apellidos = (TextView) findViewById(R.id.txtApellidos);

        campo1 = (EditText) findViewById(R.id.editNombres);
        campo2 = (EditText) findViewById(R.id.editApellidos);

        chkJava = (CheckBox) findViewById(R.id.chkJava);
        chkPhp = (CheckBox) findViewById(R.id.chkPhp);
        chkPython = (CheckBox) findViewById(R.id.chkPython);
        chkCsharp = (CheckBox) findViewById(R.id.chkCsharp);
        chkCplus = (CheckBox) findViewById(R.id.chkCplus);

        rJava = (RadioButton) findViewById(R.id.rJava);
        rPhp = (RadioButton) findViewById(R.id.rPhp);
        rPython = (RadioButton) findViewById(R.id.rPython);
        rCsharp = (RadioButton) findViewById(R.id.rCsharp);
        rCplus = (RadioButton) findViewById(R.id.rCplus);

        btnAceptar = (Button) findViewById(R.id.btnAceptar);
    }

    public void onClick(View view){

        switch (view.getId()){
            case R.id.btnAceptar:
                mostrarDatos();
                break;
        }
    }

    private void mostrarDatos(){
        String nombres = campo1.getText().toString();
        String Apellidos = campo2.getText().toString();

        CheckBox cJava = chkJava;
    }

}