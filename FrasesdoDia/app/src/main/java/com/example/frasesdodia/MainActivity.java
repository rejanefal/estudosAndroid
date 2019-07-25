package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String frases[] = {
                "Lute. Acredite. Conquiste. Perca. Deseje. Espere. Alcance. Invada. Caia. Seja tudo o quiser ser, mas acima de tudo, seja você sempre.",
                "Não deixe que as pessoas te façam desistir daquilo que você mais quer na vida. Acredite. Lute. Conquiste. E acima de tudo, seja feliz! ",
                "A criança é alegria como o raio de sol e estímulo como a esperança.",
                "O importante não é vencer todos os dias, mas lutar sempre.",
                "Maior que a tristeza de não haver vencido é a vergonha de não ter lutado!"
        };

        int posicao = new Random().nextInt(frases.length);

        TextView novaFrase = findViewById(R.id.txtNovaFRase);
        novaFrase.setText(frases[posicao]);

    }
}
