package com.loiane.cursojava.aula40;

public class Aluno extends Pessoa {
    private String curso;
    private Double[] notas;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);
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
        return 0.0; // Lógica fictícia
    }

    public boolean verificarAprovado() {
        return true; // Lógica fictícia
    }

    @Override
    public String obterEtiquetaEndereco() {
        return "Endereço do Aluno: " + this.getEndereco();
    }

    public void verificarAcesso() {
        this.setNomeVisibilidade("Verificando visibilidade");
        System.out.println("Nome Visibilidade: " + this.getNomeVisibilidade());
    }
}
