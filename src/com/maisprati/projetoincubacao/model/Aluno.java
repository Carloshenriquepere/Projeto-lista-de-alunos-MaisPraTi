package com.maisprati.projetoincubacao.model;


public class Aluno {

    private String notaFinal;

    public Aluno(String notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(String notaFinal) {
        this.notaFinal = notaFinal;
    }
}
