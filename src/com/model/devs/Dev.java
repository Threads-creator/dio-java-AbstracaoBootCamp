package com.model.devs;

import com.model.atividades.AtividadeXP;
import com.model.bootcamps.Bootcamp;
import com.model.exercicios.Exercicio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String nome;
    private double xpTotal = 0d;

    private Set<AtividadeXP> atividadesInscritas = new LinkedHashSet<>();
    private Set<AtividadeXP> atividadesConcluidas = new LinkedHashSet<>();

    public Dev(String nome){
        this.nome = nome;
    }
    public Dev(){}

    public void inscreverBootcamp(Bootcamp bootcamp){
        atividadesInscritas.addAll(bootcamp.getAtividadesObrigatorias());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        atividadesInscritas.stream().findFirst().ifPresent(feito -> {
            this.atividadesConcluidas.add(feito);
            this.atividadesInscritas.remove(feito);
            this.xpTotal += feito.calcularXP();
        });
    }

    public void cancelarInscricao(Bootcamp bootcamp){
        Set<AtividadeXP> atividades = bootcamp.getAtividadesObrigatorias();
        atividades.forEach(atividade -> {
            if (atividadesInscritas.contains(atividade)) {
                atividadesInscritas.remove(atividade);
            }
        });
        bootcamp.getDevsInscritos().removeIf(dev -> dev.equals(this));

    }

    public void realizarExercicio(Exercicio exercicio, String resposta){
        exercicio.avaliarResposta(resposta);
    }

    public double getXpTotal() {
        return xpTotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(atividadesInscritas, dev.atividadesInscritas) && Objects.equals(atividadesConcluidas, dev.atividadesConcluidas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, atividadesInscritas, atividadesConcluidas);
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", XP=" + xpTotal +
                ", atividadesInscritas=" + atividadesInscritas +
                ", atividadesConcluidas=" + atividadesConcluidas +
                '}';
    }
}
