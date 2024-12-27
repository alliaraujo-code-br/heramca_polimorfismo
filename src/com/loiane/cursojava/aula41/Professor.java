package com.loiane.cursojava.aula40;

public class Professor extends Pessoa {
    private Double salario;
    private String nomeCurso;
    private String departamento;
    private String telefoneCelular;

    // Construtor com parâmetros
    public Professor(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);  // Chama o construtor da classe Pessoa
    }

    // Construtor padrão
    public Professor() {
        super();  // Chama o construtor padrão da classe Pessoa
    }

    // Getters e setters
    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    // Método para calcular salário líquido
    public double calcularSalarioLiquido() {
        return salario != null ? salario * 0.9 : 0;
    }
}
