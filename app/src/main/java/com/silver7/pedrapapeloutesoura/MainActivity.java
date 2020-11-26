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

    public void pedraSelecionada(View view) {

        this.opcaoSelecionada("pedra");
    }

    public void papelSelecionada(View view) {


        this.opcaoSelecionada("papel");
    }


    public void tesouraSelecionada(View view) {
        this.opcaoSelecionada("tesoura");
    }

    int placarApp = 0;
    int placarUsuario = 0;
    int placarEmpate = 0;

    public void opcaoSelecionada(String opcaoSelecionada) {

        ImageView imagemResultado = findViewById(R.id.imagemResultado);
        TextView textoResultado = findViewById(R.id.textResultado);
        int app = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String opcaoApp = opcoes[app];

        switch (opcaoApp) {
            case "pedra":
                imagemResultado.setImageResource(R.drawable.pedra);
                break;

            case "papel":
                imagemResultado.setImageResource(R.drawable.papel);
                break;

            case "tesoura":
                imagemResultado.setImageResource(R.drawable.tesoura);
                break;
        }


        if (
                (opcaoApp == "pedra" && opcaoSelecionada == "tesoura") ||
                (opcaoApp == "papel" && opcaoSelecionada == "pedra") ||
                (opcaoApp == "tesoura" && opcaoSelecionada == "papel")
        ) {
                textoResultado.setText("Você Perdeu");
                placarApp++;
        } else if (
                (opcaoSelecionada == "pedra" && opcaoApp == "tesoura") ||
                (opcaoSelecionada == "papel" && opcaoApp == "pedra") ||
                (opcaoSelecionada == "tesoura" && opcaoApp == "papel")
        ) {
                textoResultado.setText("Você Ganhou");
                placarUsuario++;
        } else {
                textoResultado.setText("Deu Empate");
                placarEmpate++;
        }

        TextView pontosApp = findViewById(R.id.pontosApp);
        pontosApp.setText(String.valueOf(placarApp));
        TextView pontosUsuario = findViewById(R.id.pontosUsuario);
        pontosUsuario.setText(String.valueOf(placarUsuario));
        TextView pontosEmpate = findViewById(R.id.pontosEmpate);
        pontosEmpate.setText(String.valueOf(placarEmpate));

        System.out.println("Quero Resultado O1 " + opcaoApp);
        System.out.println("Quero Resultado O2 " + opcaoSelecionada);
        System.out.println("Quero Resultado P1 " + placarApp);
        System.out.println("Quero Resultado P2 " + placarUsuario);
    }

    public int getPlacarApp() {
        return placarApp;

    }

    public int getPlacarUsuario() {
        return placarUsuario;

    }

    public int getPlacarEmpate() {
        return placarEmpate;
    }

}