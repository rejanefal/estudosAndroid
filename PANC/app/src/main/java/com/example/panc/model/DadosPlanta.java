package com.example.panc.model;

import android.graphics.Bitmap;

public class DadosPlanta {
    private Bitmap foto;
    private String nome;
    private String historia;
    private String cientifico;
    private String regiao;

    public DadosPlanta(Bitmap foto, String nome, String historia, String cientifico, String regiao) {
        this.foto = foto;
        this.nome = nome;
        this.historia = historia;
        this.cientifico = cientifico;
        this.regiao = regiao;
    }

    public Bitmap getFoto() {
        return foto;
    }

    public void setFoto(Bitmap foto) {
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getCientifico() {
        return cientifico;
    }

    public void setCientifico(String cientifico) {
        this.cientifico = cientifico;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
}
