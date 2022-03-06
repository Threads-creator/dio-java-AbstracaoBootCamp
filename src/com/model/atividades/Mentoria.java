package com.model.atividades;

import java.time.LocalDate;

public class Mentoria extends AtividadeXP{

    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data){
        super.setTitulo(titulo);
        super.setDescricao(descricao);
        setData(data);
    }
    public Mentoria(){}

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo=" +getTitulo() +
                ", descricao=" +getDescricao() +
                ", data=" + data +
                '}';
    }
}
