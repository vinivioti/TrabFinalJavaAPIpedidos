package br.com.impacta.orderservice.model;

public class Pessoa {

    private int id;
    private String nomeCompleto;
    private String email;
    private String endereco;

    public Pessoa(int id, String nomeCompleto, String email, String endereco) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
