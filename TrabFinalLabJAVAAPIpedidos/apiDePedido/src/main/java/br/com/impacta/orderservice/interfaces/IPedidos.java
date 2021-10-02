package br.com.impacta.orderservice.interfaces;

import br.com.impacta.orderservice.exception.EntityNotFoundException;
import br.com.impacta.orderservice.model.Pedido;

import java.util.List;

public interface IPedidos {

    List<Pedido> buscaTodosPedidos();
    Pedido buscaPedidoPorId(int idPedido) throws EntityNotFoundException;
    int salvar(Pedido pedido);
    Boolean deletarPedido(int idPedido) throws EntityNotFoundException;
    Pedido atualizarPedido(int idPedido, Pedido pedido) throws EntityNotFoundException;

}
