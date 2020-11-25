package com.silver7.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pedraSelecionada(View view){

        this.opcaoSelecionada("pedra");
    }

    public void papelSelecionada(View view){


        this.opcaoSelecionada("papel");
    }


    public void tesouraSelecionada(View view){
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String opcaoSelecionada){

        ImageView imagemResultado = findViewById(R.id.imagemResultado);
        TextView textoResultado = findViewById(R.id.textResultado);
        int app = new Random().nextInt(3);
        String [] opcoes = {"pedra","papel","tesoura"};
        String opcaoApp = opcoes [app];

        switch (opcaoApp){
            case "pedra" :
                imagemResultado.setImageResource(R.drawable.pedra);
                break;

            case "papel" :
                imagemResultado.setImageResource(R.drawable.papel);
                break;

            case "tesoura" :
                imagemResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        if (
                (opcaoApp == "pedra" && opcaoSelecionada == "tesoura") ||
                (opcaoApp == "papel" && opcaoSelecionada == "pedra") ||
                (opcaoApp == "tesoura" && opcaoSelecionada == "papel")
        ){
            textoResultado.setText("Você Perdeu");
        }else if(
                (opcaoSelecionada == "pedra" && opcaoApp == "tesoura") ||
                (opcaoSelecionada == "papel" && opcaoApp == "pedra") ||
                (opcaoSelecionada == "tesoura" && opcaoApp == "papel")
        ){
            textoResultado.setText("Você Ganhou");

        }else{
            textoResultado.setText("Deu Empate");

        }

        System.out.println("Quero Resultado "+opcaoApp);
        System.out.println("Quero Resultado "+opcaoSelecionada);
        System.out.println("Quero Resultado "+textoResultado);
/*
        if (opcaoSelecionada == opcaoApp) {
            texto.setText("Deu EMPATE");
        } else if (opcaoSelecionada == "pedra" && opcaoApp == "tesoura") {
            texto.setText("Você GANHOU");
        } else if (opcaoSelecionada == "papel" && opcaoApp == "pedra") {
            texto.setText("Você GANHOU");
        } else if (opcaoSelecionada == "tesoura" && opcaoApp == "papel") {
            texto.setText("Você GANHOU");
        } else if (opcaoSelecionada == "pedra" && opcaoApp == "papel") {
            texto.setText("Você PERDEU");
        } else if (opcaoSelecionada == "papel" && opcaoApp == "tesoura") {
            texto.setText("Você PERDEU");
        } else {
            texto.setText("Você PERDEU");
        }
*/



    }


}
