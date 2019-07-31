package com.example.panc.adapters;

import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.panc.R;
import com.example.panc.holders.DadosPlantaHolder;
import com.example.panc.model.DadosPlanta;

import java.util.ArrayList;
import java.util.List;

public class DadosPlantaAdapter extends RecyclerView.Adapter<DadosPlantaHolder> {

    private List<DadosPlanta> dadosPlantaList = new ArrayList<>();

    public DadosPlantaAdapter(List<DadosPlanta> dadosPlantaList) {
        this.dadosPlantaList = dadosPlantaList;
    }

    @Override
    public DadosPlantaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.content_item_list, parent, false);
        return new DadosPlantaHolder(view);
    }

    @Override
    public void onBindViewHolder(DadosPlantaHolder holder, int position) {
        DadosPlanta dadosPlanta =  dadosPlantaList.get(position);
        if(dadosPlanta!=null) {
            holder.bindTo(dadosPlanta);
        }
    }

    @Override
    public int getItemCount() {
        return dadosPlantaList.size();
    }

}
