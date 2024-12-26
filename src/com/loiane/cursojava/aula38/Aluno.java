    package com.loiane.cursojava.aula37;

    public class Aluno extends Pessoa {
        private String curso;
        private Double[] notas;

    public Double[] getNotas() {
        return notas;
    }
    public void setNotas(Double[] notas) {
        this.notas = notas;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public Double calcularMedia() {
        return (double) 0;
    }
    public boolean verificarAprovado() {
        return true;
    }
}