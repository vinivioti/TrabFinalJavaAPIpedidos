package br.com.impacta.orderservice.model;

import java.io.Serializable;
import java.util.List;

public class Pedido implements Serializable {

    private int idPedido;
    private String dataPedido;
    private String statusPedido;
    private Pessoa pessoa;
    private List<Produto> produto;
    private Pagamento pagamento;

    public Pedido(int idPedido, String dataPedido, String statusPedido, Pessoa pessoa, List<Produto> produto, Pagamento pagamento) {
        this.idPedido = idPedido;
        this.dataPedido = dataPedido;
        this.statusPedido = statusPedido;
        this.pessoa = pessoa;
        this.produto = produto;
        this.pagamento = pagamento;
    }

    public Pedido(){}

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

}
