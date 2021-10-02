package br.com.impacta.orderservice.controller;

import br.com.impacta.orderservice.exception.ParameterException;
import br.com.impacta.orderservice.exception.EntityNotFoundException;
import br.com.impacta.orderservice.model.Pedido;
import br.com.impacta.orderservice.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController()
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedido;
    private final String baseUrl = "http://localhost:8080/pedido/";

    @GetMapping("/findById")
    public ResponseEntity buscarPedido(@PathParam("id") int id) throws EntityNotFoundException {
        return new ResponseEntity(this.pedido.buscaPedidoPorId(id), HttpStatus.OK);
    }

    @GetMapping("/findByAll")
    public ResponseEntity<List<Pedido>> buscaTodosPedidos(){
        return ResponseEntity.ok(this.pedido.buscaTodosPedidos());
    }

    @PostMapping("/save")
    public ResponseEntity salvarPedido(@RequestBody Pedido pedidos) throws ParameterException {
        return new ResponseEntity(String.format("%s/save/%s", baseUrl, this.pedido.salvar(pedidos)), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deletarPedido(@PathVariable(value = "id") int id) throws ParameterException, EntityNotFoundException {
        return new ResponseEntity(String.format("Pedido %s excluído.", this.pedido.deletarPedido(id)), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Pedido> atualizarDados(@PathParam("id") int id, @RequestBody Pedido pedido) throws EntityNotFoundException {
        Pedido ped = this.pedido.atualizarPedido(id,pedido);

        return new ResponseEntity(ped, HttpStatus.OK);
    }
}
