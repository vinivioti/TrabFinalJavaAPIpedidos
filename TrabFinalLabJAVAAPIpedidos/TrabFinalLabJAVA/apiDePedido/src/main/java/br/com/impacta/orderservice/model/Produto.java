package br.com.impacta.orderservice.model;

import br.com.impacta.orderservice.utils.Formatar;

import java.math.BigDecimal;

public class Produto {

    private int idProduto;
    private String descricaoProduto;
    private int quantidadeProduto;
    private BigDecimal precoProduto;
    private BigDecimal totalProduto;

    public Produto(int idProduto, String descricaoProduto, int quantidadeProduto, BigDecimal precoProduto) {
        this.idProduto = idProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.precoProduto = Formatar.casasDecimais(precoProduto);
    }

    public long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public BigDecimal getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(BigDecimal precoProduto) {
        this.precoProduto = precoProduto;
    }

    public BigDecimal getTotalProduto(){
        return Formatar.casasDecimais(this.totalProduto = //
                this.precoProduto.multiply(BigDecimal.valueOf(this.quantidadeProduto)));
    }
}
