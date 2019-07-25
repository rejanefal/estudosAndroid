package com.example.conversormoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.mViewHolder.editValue = findViewById(R.id.edit_valor);
        this.mViewHolder.textDolar = findViewById(R.id.text_dolar);
        this.mViewHolder.textEuro = findViewById(R.id.text_euro);
        this.mViewHolder.buttonCaulculate = findViewById(R.id.btnCalcular);

        this.mViewHolder.buttonCaulculate.setOnClickListener(this);
        this.mViewHolder.textDolar.setOnClickListener(this);
        //EditText valor = findViewById(R.id.edit_valor);
        //valor.getText();
        this.clearValues();

    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.btnCalcular){
            String value = this.mViewHolder.editValue.getText().toString();
            if(value.isEmpty() || value==null){
                Toast.makeText(this, this.getString(R.string.informe_valor), Toast.LENGTH_LONG).show();
                this.clearValues();
            }
            else{

                Double real= Double.valueOf(value);

                this.mViewHolder.textDolar.setText(String.format("%.2f", (real * 4)));
                this.mViewHolder.textEuro.setText(String.format("%.2f", (real * 5)));
            }
        }
    }

    private void clearValues(){
        this.mViewHolder.textDolar.setText("");
        this.mViewHolder.textEuro.setText("");
    }

    private static  class ViewHolder{

        EditText editValue;
        TextView textDolar;
        TextView textEuro;
        Button buttonCaulculate;
    }
}
