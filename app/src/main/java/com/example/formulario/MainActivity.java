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
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private String nombreCompleto, lenguajes, lenguajesFav;

    private EditText campo1, campo2;

    private CheckBox chJava, chPhp,chPython, chCsharp, chCplus;

    private RadioGroup radioGroup1;
    private RadioButton selectedRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campo1 = (EditText) findViewById(R.id.editNombres);
        campo2 = (EditText) findViewById(R.id.editApellidos);

        chJava = (CheckBox) findViewById(R.id.chkJava);
        chPhp = (CheckBox) findViewById(R.id.chkPhp);
        chPython = (CheckBox) findViewById(R.id.chkPython);
        chCsharp = (CheckBox) findViewById(R.id.chkCsharp);
        chCplus = (CheckBox) findViewById(R.id.chkCplus);

        radioGroup1 = (RadioGroup) findViewById(R.id.radio_group_1);

    }

    public void mostrarDatos(View view){
        Intent intent = new Intent(this, ShowDataActivity.class);
        nombreCompleto = campo1.getText().toString() + " " + campo2.getText().toString();

        intent.putExtra("Nombres:", nombreCompleto);
        lenguajes = "";
        addLenguaje(chJava);
        addLenguaje(chPhp);
        addLenguaje(chPython);
        addLenguaje(chCsharp);
        addLenguaje(chCplus);
        intent.putExtra("lenguajes",lenguajes);

        selectedRadioButton = (RadioButton) findViewById(radioGroup1.getCheckedRadioButtonId());
        intent.putExtra("lenguajePreferido", selectedRadioButton.getText().toString());

        startActivity(intent);

    }

    private void addLenguaje(CheckBox chkBox) {
        if(chkBox.isChecked()){
            if(lenguajes != ""){
                lenguajes += ", " + chkBox.getText().toString();
            } else{
                lenguajes = chkBox.getText().toString();
            }
        }
    }
}