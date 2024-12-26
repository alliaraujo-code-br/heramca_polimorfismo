package com.loiane.cursojava.aula38;

public class Professor extends Pessoa {

    private Double salario;
    private String nomeCurso;
    private String Departamento;
    private String telefoneCelular;

    public void verificarAcesso(){
        this.nomeVisibilidade = "verificando visibilidade";
        super.nomeVisibilidade = "verificando visibilidade";
    }

    public Professor(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Professor(){
        super();
    }

    public void Pessoa() {
        return;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

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
    public double  calcularSalarioLiquido(){
        return 0;
    }
}
