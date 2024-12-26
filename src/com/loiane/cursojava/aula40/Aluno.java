    package com.loiane.cursojava.aula38;

    public class Aluno extends Pessoa {
        private String curso;
        private Double[] notas;

        public void verificarAcesso(){
            this.nomeVisibilidade = "verificando visibilidade";
            super.nomeVisibilidade = "verificando visibilidade";
        }

        public Aluno () {
            super();
        }
        public Aluno(String nome, String endereco, String telefone, String curso){
            super(nome,endereco,telefone);
            this.curso = curso;
        }
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

    public void metodoQualquer(){
            super.setCpf("02302900557");
            this.setCpf("1234567789");
    }

    }