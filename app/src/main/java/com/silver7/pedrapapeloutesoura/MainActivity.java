package com.silver7.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pedraSelecionada(View view){
        this.opcaoSelecionada("Pedra");
    }

    public void papelSelecionada(View view){
        this.opcaoSelecionada("Papel");
    }

    public void tesouraSelecionada(View view){
        this.opcaoSelecionada("Tesoura");
    }
    public void opcaoSelecionada(String opcaoSelecionada){

        System.out.println("Iten selecionado: " + opcaoSelecionada );

    }


}
