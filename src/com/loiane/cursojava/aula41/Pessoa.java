package com.loiane.cursojava.aula40;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String nomeVisibilidade;

    // Construtor sem parâmetros
    public Pessoa() {}

    // Construtor com parâmetros
    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNomeVisibilidade() {
        return nomeVisibilidade;
    }

    public void setNomeVisibilidade(String nomeVisibilidade) {
        this.nomeVisibilidade = nomeVisibilidade;
    }

    public String obterEtiquetaEndereco() {
        return "Endereço: " + this.endereco;
    }
}
