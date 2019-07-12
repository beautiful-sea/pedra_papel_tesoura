package com.example.pedrapapeltesoura;

import android.support.v7.app.AppCompatActivity;
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

    public void opcaoSelecionada(String escolhaUsuario){

        ImageView imagemResultado = (ImageView) findViewById(R.id.imagemResultado);

        String[] opcoes = {"pedra","papel","tesoura"};

        int numero = new Random().nextInt(3);

        String escolhaApp = opcoes[numero];
        TextView textResultado = findViewById(R.id.textResultado);
        switch (escolhaApp){
            case "pedra":
                imagemResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imagemResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imagemResultado.setImageResource(R.drawable.tesoura);
        }

        if(
                (escolhaUsuario == "pedra" && escolhaApp == "tesoura") || (escolhaUsuario == "papel" && escolhaApp == "pedra") ||(escolhaUsuario == "tesoura" && escolhaApp == "papel")
        ){
            textResultado.setText("Você ganhou!!");
        }else if(
                (escolhaUsuario == "pedra" && escolhaApp == "pedra") || (escolhaUsuario == "papel" && escolhaApp == "papel") ||(escolhaUsuario == "tesoura" && escolhaApp == "tesoura")
        ){
            textResultado.setText("Empate!!");
        }else if(
                (escolhaUsuario == "tesoura" && escolhaApp == "pedra") || (escolhaUsuario == "pedra" && escolhaApp == "papel") ||(escolhaUsuario == "papel" && escolhaApp == "tesoura")
        ){
            textResultado.setText("Você perdeu!!");
        }

    }

    public void selecionarPedra(View view){
        this.opcaoSelecionada("pedra");
    }

    public void selecionarPapel(View view){
        this.opcaoSelecionada("papel");
    }

    public void selecionarTesoura(View view){
        this.opcaoSelecionada("tesoura");
    }
}
