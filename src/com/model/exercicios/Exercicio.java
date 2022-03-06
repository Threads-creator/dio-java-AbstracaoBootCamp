package com.model.exercicios;

public abstract class Exercicio {

    private String enunciado = "";
    private String respostaCorreta= "";
    private boolean correto = false;

    public void avaliarResposta(String resposta){
        if(respostaCorreta.equalsIgnoreCase(resposta)) correto = true;
    };

    public String getEnunciado() {
        return enunciado;
    }

    public boolean estaCorreto() {
        return correto;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(String respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

    @Override
    public String toString() {
        return "Exercicio{" +
                "enunciado='" + enunciado + '\'' +
                ", respostaCorreta='" + respostaCorreta + '\'' +
                ", correto=" + correto +
                '}';
    }
}
