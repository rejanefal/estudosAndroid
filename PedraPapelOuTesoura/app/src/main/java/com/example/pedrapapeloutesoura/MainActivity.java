package com.example.pedrapapeloutesoura;

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

    public void selecionarPedra(View view){
        this.opcaoSelecionada("pedra");
    }

    public void selecionarPapel(View view){
        this.opcaoSelecionada("papel");
    }

    public void selecionarTesoura(View view){
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String escolhaUsuario){
        ImageView imagemResultado = findViewById(R.id.imgResultado);
        TextView resultado = findViewById(R.id.txtEscolhaOpcao);

        String[] opcoes = {"pedra","papel","tesoura"};
        int numero = new Random().nextInt(3);
        String escolhaApp = opcoes[numero];

        switch (escolhaApp){
            case "pedra":
                imagemResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imagemResultado.setImageResource(R.drawable.papel);
                break;
            default:
                imagemResultado.setImageResource(R.drawable.tesoura);

        }

        if( (escolhaApp.equals("pedra") && escolhaUsuario.equals("tesoura")) ||
            (escolhaApp.equals("papel") && escolhaUsuario.equals("pedra")) ||
            (escolhaApp.equals("tesoura") && escolhaUsuario.equals("papel"))
           )
        { //APP ganhador
            resultado.setText("O App ganhou!");
        }
        else if((escolhaUsuario.equals("pedra") && escolhaApp.equals("tesoura")) ||
                (escolhaUsuario.equals("papel") && escolhaApp.equals("pedra")) ||
                (escolhaUsuario.equals("tesoura") && escolhaApp.equals("papel")))
        { //usuario ganhador
            resultado.setText("Você ganhou!!!");
        }
        else{// empate
            resultado.setText("Empate!!!");
        }
        //System.out.println(escolhaUsuario);
    }
}
