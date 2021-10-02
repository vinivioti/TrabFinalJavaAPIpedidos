package br.com.impacta.orderservice.service;

import br.com.impacta.orderservice.exception.ParameterException;
import br.com.impacta.orderservice.exception.EntityNotFoundException;
import br.com.impacta.orderservice.interfaces.IPedidos;
import br.com.impacta.orderservice.model.Pedido;
import br.com.impacta.orderservice.model.Produto;
import br.com.impacta.orderservice.repository.PedidosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService implements IPedidos {

    @Autowired
    private PedidosRepositorio repositorio;

    @Override
    public List<Pedido> buscaTodosPedidos(){
        return repositorio.listaDePedidos();
    }

    @Override
    public Pedido buscaPedidoPorId(int idPedido) throws EntityNotFoundException {
        var pedidoConsultado = getPedido(idPedido);
        if (pedidoConsultado.isEmpty())
            throw new EntityNotFoundException(String.format("O pedido %s não foi encontrado.", idPedido));

        return pedidoConsultado.get();
    }

    @Override
    public int salvar(Pedido pedido) throws ParameterException {
        if (!(pedido.getIdPedido() == 0 && pedido.getDataPedido().equals(null))){
            Pedido novoPedido = new Pedido(pedido.getIdPedido(),pedido.getDataPedido(), //
                    pedido.getStatusPedido(), pedido.getPessoa(), pedido.getProduto(), pedido.getPagamento());

            repositorio.adicionaPedido(novoPedido);
            return novoPedido.getIdPedido();
        }

        throw new ParameterException("O pedido está incorreto!");
    }

    @Override
    public Boolean deletarPedido(int idPedido) throws ParameterException, EntityNotFoundException {
        if (idPedido == 0)
            throw new ParameterException("O parametro id está incorreto!");

        var pedidoConsultado = getPedido(idPedido);
        if (pedidoConsultado.isEmpty())
            throw new EntityNotFoundException(String.format("O pedido %s não foi encontrado.", idPedido));

        return repositorio.deletarPedido(pedidoConsultado.get());
    }

    @Override
    public Pedido atualizarPedido(int idPedido, Pedido pedido) throws EntityNotFoundException {
        var pedidoConsultado = getPedido(idPedido);
        if (pedidoConsultado.isEmpty())
            throw new EntityNotFoundException(String.format("O pedido %s não foi encontrado.", idPedido));

        return atualizaDados(pedidoConsultado.get(), pedido);
    }

    private Optional<Pedido> getPedido(int idPedido) {
        return repositorio.listaDePedidos().stream() //
                .filter(pedido -> pedido.getIdPedido() == idPedido)//
                .findFirst();
    }

    private Pedido atualizaDados(Pedido pedidoEspecifico, Pedido pedidoAtualizado){
        Pedido atualiza = pedidoEspecifico;
        atualiza.getPessoa().setEndereco(pedidoAtualizado.getPessoa().getEndereco());
        atualizaProduto(pedidoAtualizado, atualiza);
        atualiza.setDataPedido(pedidoAtualizado.getDataPedido());
        atualiza.getPagamento().setIdTransacao(pedidoAtualizado.getPagamento().getIdTransacao());
        atualiza.getPagamento().setBandeira(pedidoAtualizado.getPagamento().getBandeira());
        atualiza.getPagamento().setNumeroCartao(pedidoAtualizado.getPagamento().getNumeroCartao());
        atualiza.getPagamento().setVencimentoCartao(pedidoAtualizado.getPagamento().getVencimentoCartao());
        return atualiza;
    }

    private void atualizaProduto(Pedido pedidoAtualizado, Pedido atualiza) {
        List<Produto> prod = atualiza.getProduto();
        List<Produto> pedAtualizado = pedidoAtualizado.getProduto();

        prod.stream().forEach(p -> {
           pedAtualizado.stream().forEach(prodAt -> {
                   p.setDescricaoProduto(prodAt.getDescricaoProduto());
                   p.setQuantidadeProduto(prodAt.getQuantidadeProduto());
                   p.setPrecoProduto(prodAt.getPrecoProduto());
           });
        });
        }
}
