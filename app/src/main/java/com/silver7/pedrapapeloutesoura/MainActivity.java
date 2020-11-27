package com.silver7.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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

    @SuppressLint("SetTextI18n")
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
                (opcaoApp.equals("pedra") && opcaoSelecionada.equals("tesoura")) ||
                (opcaoApp.equals("papel") && opcaoSelecionada.equals("pedra")) ||
                (opcaoApp.equals("tesoura") && opcaoSelecionada.equals("papel"))
        ) {
                textoResultado.setText("Você Perdeu");
                placarApp++;
        } else if (
                (opcaoSelecionada.equals("pedra") && opcaoApp.equals("tesoura")) ||
                (opcaoSelecionada.equals("papel") && opcaoApp.equals("pedra")) ||
                (opcaoSelecionada.equals("tesoura") && opcaoApp.equals("papel"))
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

    }


}