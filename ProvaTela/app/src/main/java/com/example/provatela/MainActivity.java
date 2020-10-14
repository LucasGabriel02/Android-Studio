package com.example.provatela;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void numeroDiscado(View view){

        switch (view.getId()){

            case R.id.button1:
                txtDiscagem.setText(txtDiscagem.getText() + "1");
                break;
            case R.id.button2:
                txtDiscagem.setText(txtDiscagem.getText() + "2");
                break;
            case R.id.button3:
                txtDiscagem.setText(txtDiscagem.getText() + "3");
                break;
            case R.id.button4:
                txtDiscagem.setText(txtDiscagem.getText() + "4");
                break;
            case R.id.button5:
                txtDiscagem.setText(txtDiscagem.getText() + "5");
                break;
            case R.id.button6:
                txtDiscagem.setText(txtDiscagem.getText() + "6");
                break;
            case R.id.button7:
                txtDiscagem.setText(txtDiscagem.getText() + "7");
                break;
            case R.id.button8:
                txtDiscagem.setText(txtDiscagem.getText() + "8");
                break;
            case R.id.button9:
                txtDiscagem.setText(txtDiscagem.getText() + "9");
                break;
            case R.id.button0:
                txtDiscagem.setText(txtDiscagem.getText() + "0");
                break;
            case R.id.button_ligar:
                Toast.makeText(MainActivity.this,txtDiscagem.getText(),Toast.LENGTH_LONG).show();

        }

    }

    public void removerNumero(View view){
        //Texto do Label
        String texto = (String) txtDiscagem.getText();
        //Tamanho da String
        int tamanho = texto.length();
        //remover sempre o ultimo caracter de uma cadeia de caracter, mas primeiro ele verifica sem tem algo se não o APP Crashar
        if(tamanho > 0){
            texto = texto.substring(0,tamanho - 1);
        }
        txtDiscagem.setText(texto);
    }
}