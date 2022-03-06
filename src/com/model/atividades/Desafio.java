package com.model.atividades;

import com.model.exercicios.Exercicio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Desafio extends AtividadeXP {

    Set<Exercicio> tarefas = new LinkedHashSet<>();

    public Desafio(String titulo, String descricao){
        super.setTitulo(titulo);
        super.setDescricao(descricao);
    }
    public Desafio(){}

    public Set<Exercicio> getTarefas() {
        return tarefas;
    }

    public void setTarefas(Set<Exercicio> tarefas) {
        this.tarefas = tarefas;
    }


    @Override
    public double calcularXP() {
        if(estaConcluidaTarefas()) return XP_PADRAO + 40d;
        return 0d;
    }

    private boolean estaConcluidaTarefas() {
        for(Exercicio tarefa : tarefas){
            if(!tarefa.estaCorreto()) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Desafio{" +
                ", titulo=" + getTitulo() +
                ", tarefas=" + tarefas +
                '}';
    }
}
