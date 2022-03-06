package com.model.bootcamps;

import com.model.devs.Dev;
import com.model.atividades.AtividadeXP;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private LocalDate dataInicial;
    private LocalDate dataFinal;

    private Set<AtividadeXP> atividadesObrigatorias = new LinkedHashSet<>();
    private Set<Dev> devsInscritos = new HashSet<>();

    public Set<AtividadeXP> getAtividadesObrigatorias() {
        return atividadesObrigatorias;
    }

    public void setAtividadesObrigatorias(Set<AtividadeXP> atividadesObrigatorias) {
        this.atividadesObrigatorias = atividadesObrigatorias;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", atividadesObrigatorias=" + atividadesObrigatorias +
                "\n, devs=" + devsInscritos +
                '}';
    }
}
