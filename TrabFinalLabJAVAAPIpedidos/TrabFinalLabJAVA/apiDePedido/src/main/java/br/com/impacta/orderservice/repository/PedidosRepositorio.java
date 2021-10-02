package br.com.impacta.orderservice.repository;

import br.com.impacta.orderservice.model.Pagamento;
import br.com.impacta.orderservice.model.Pedido;
import br.com.impacta.orderservice.model.Pessoa;
import br.com.impacta.orderservice.model.Produto;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

@Repository
public class PedidosRepositorio {

    private List<Pedido> pedidos = new ArrayList<>();

    private PedidosRepositorio(){
        pedidos.add(pedido1());
        pedidos.add(pedido2());
        pedidos.add(pedido3());
    }

    public List<Pedido> listaDePedidos(){
        return pedidos;
    }

    public void adicionaPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    public Boolean deletarPedido(Pedido pedido){
        Boolean statusLista;
        int quantidade = pedidos.size();
        pedidos.remove(pedido);
        return statusLista =  pedidos.size() != quantidade? Boolean.TRUE:Boolean.FALSE;
    }

    private Pedido pedido1(){
        Pessoa pessoa1 = new Pessoa(1, "Leonardo Ananias", "leonardo@leonardo", "Rua");
        Produto produto1 = new Produto(1, "refrigerante",1, new BigDecimal(4.50));
        Produto produto2 = new Produto(2, "Agua",1, new BigDecimal(2.50));
        Produto produto3 = new Produto(3, "pastel de frango",2, new BigDecimal(8.00));
        Pagamento pagamento1 = new Pagamento(1234564, 445126584,"05/2028", "Visa");
        List<Produto> produtos = List.of(produto1, produto2,produto3);
        return new Pedido(1, "31/09/2021", "Em andamento", pessoa1 ,produtos, pagamento1);
    }

    private Pedido pedido2(){
        Pessoa pessoa2 = new Pessoa(2, "Vinisius Vioti", "vinissius@vioti", "Rua");
        Produto produto1 = new Produto(5, "x-tudo",1, new BigDecimal(25.30));
        Produto produto2 = new Produto(6, "coca-cola",1, new BigDecimal(2.50));
        Produto produto3 = new Produto(7, "shawarma",2, new BigDecimal(8.00));
        Pagamento pagamento2 = new Pagamento(789789798, 12224687,"05/2028", "Visa");
        List<Produto> produtos = List.of(produto1, produto2,produto3);
        return new Pedido(2, "31/09/2021", "Finalizado", pessoa2 ,produtos, pagamento2);
    }

    private Pedido pedido3(){
        Pessoa pessoa3 = new Pessoa(3, "Roan professor", "roan@professor", "Rua");
        Produto produto1 = new Produto(8, "suco",1, new BigDecimal(6.80));
        Produto produto2 = new Produto(6, "coco-cola",1, new BigDecimal(2.50));
        Produto produto3 = new Produto(4, "x-salada",2, new BigDecimal(8.00));
        Pagamento pagamento3 = new Pagamento(99988789, 886579879,"05/2028", "Amex");
        List<Produto> produtos = List.of(produto1, produto2,produto3);
        return new Pedido(3, "31/09/2021", "Aguardando", pessoa3 ,produtos, pagamento3);
    }
}
