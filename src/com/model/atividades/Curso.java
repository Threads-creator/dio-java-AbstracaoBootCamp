package com.model.atividades;

public class Curso extends AtividadeXP{

    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria){
        super.setTitulo(titulo);
        super.setDescricao(descricao);
        setCargaHoraria(cargaHoraria);
    }
    public Curso(){}

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo=" +getTitulo() +
                ", descricao=" +getDescricao() +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
