package com.example.panc.holders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.panc.R;
import com.example.panc.model.DadosPlanta;

public class DadosPlantaHolder extends RecyclerView.ViewHolder {

    TextView plantaName;
    ImageView imgPlanta;

    public DadosPlantaHolder(View itemView) {
        super(itemView);
        plantaName = itemView.findViewById(R.id.txtNomePlanta);
        imgPlanta = itemView.findViewById(R.id.imgPlanta);
    }

    public void bindTo(DadosPlanta dadosPlanta) {
        plantaName.setText(dadosPlanta.getNome());
        imgPlanta.setImageBitmap(dadosPlanta.getFoto());
    }
}

