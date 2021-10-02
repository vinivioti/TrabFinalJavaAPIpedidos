package br.com.impacta.orderservice.model;

public class Pagamento {

    private int idTransacao;
    private int numeroCartao;
    private String vencimentoCartao;
    private String bandeira;

    public Pagamento(int idTransacao, int numeroCartao, String vencimentoCartao, String bandeira) {
        this.idTransacao = idTransacao;
        this.numeroCartao = numeroCartao;
        this.vencimentoCartao = vencimentoCartao;
        this.bandeira = bandeira;
    }

    public int getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getVencimentoCartao() {
        return vencimentoCartao;
    }

    public void setVencimentoCartao(String vencimentoCartao) {
        this.vencimentoCartao = vencimentoCartao;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
}
