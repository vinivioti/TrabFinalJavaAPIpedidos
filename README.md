# TrabFinalJavaAPIpedidos
APi de Pedidos feito em JAVA

# Exemplos de utilização OrderService e PaymentService

    A seguir alguns exemplos de chamadas para se utilizar a API

# OrderService

## Endpoint findById

    Possibilita ao usuario encontrar um pedido (Order) a partir do ID do mesmo

### Exemplo de utilização

   http://localhost:8080/pedido/findById?id=3

    OBS.: O mesmo irá retornar o pedido no formato JSON
    
    {
    "idPedido": 3,
    "dataPedido": "31/09/2021",
    "statusPedido": "Aguardando",
    "pessoa": {
        "id": 3,
        "nomeCompleto": "Roan professor",
        "email": "roan@professor",
        "endereco": "Rua"
    },
    "produto": [
        {
            "idProduto": 8,
            "descricaoProduto": "suco",
            "quantidadeProduto": 1,
            "precoProduto": 6.80,
            "totalProduto": 6.80
        },
        {
            "idProduto": 6,
            "descricaoProduto": "coco-cola",
            "quantidadeProduto": 1,
            "precoProduto": 2.50,
            "totalProduto": 2.50
        },
        {
            "idProduto": 4,
            "descricaoProduto": "x-salada",
            "quantidadeProduto": 2,
            "precoProduto": 8.00,
            "totalProduto": 16.00
        }
    ],
    "pagamento": {
        "idTransacao": 99988789,
        "numeroCartao": 886579879,
        "vencimentoCartao": "05/2028",
        "bandeira": "Amex"
    }
}

## Endpoint FindByAll

O mesmo irá retornar todos os pedidos no formato JSON

http://localhost:8080/pedido/findByAll

[
    {
        "idPedido": 1,
        "dataPedido": "31/09/2021",
        "statusPedido": "Em andamento",
        "pessoa": {
            "id": 1,
            "nomeCompleto": "Leonardo Ananias",
            "email": "leonardo@leonardo",
            "endereco": "Rua"
        },
        "produto": [
            {
                "idProduto": 1,
                "descricaoProduto": "refrigerante",
                "quantidadeProduto": 1,
                "precoProduto": 4.50,
                "totalProduto": 4.50
            },
            {
                "idProduto": 2,
                "descricaoProduto": "Agua",
                "quantidadeProduto": 1,
                "precoProduto": 2.50,
                "totalProduto": 2.50
            },
            {
                "idProduto": 3,
                "descricaoProduto": "pastel de frango",
                "quantidadeProduto": 2,
                "precoProduto": 8.00,
                "totalProduto": 16.00
            }
        ],
        "pagamento": {
            "idTransacao": 1234564,
            "numeroCartao": 445126584,
            "vencimentoCartao": "05/2028",
            "bandeira": "Visa"
        }
    },
    {
        "idPedido": 2,
        "dataPedido": "31/09/2021",
        "statusPedido": "Finalizado",
        "pessoa": {
            "id": 2,
            "nomeCompleto": "Vinisius Vioti",
            "email": "vinissius@vioti",
            "endereco": "Rua"
        },
        "produto": [
            {
                "idProduto": 5,
                "descricaoProduto": "x-tudo",
                "quantidadeProduto": 1,
                "precoProduto": 25.30,
                "totalProduto": 25.30
            },
            {
                "idProduto": 6,
                "descricaoProduto": "coca-cola",
                "quantidadeProduto": 1,
                "precoProduto": 2.50,
                "totalProduto": 2.50
            },
            {
                "idProduto": 7,
                "descricaoProduto": "shawarma",
                "quantidadeProduto": 2,
                "precoProduto": 8.00,
                "totalProduto": 16.00
            }
        ],
        "pagamento": {
            "idTransacao": 789789798,
            "numeroCartao": 12224687,
            "vencimentoCartao": "05/2028",
            "bandeira": "Visa"
        }
    },
    {
        "idPedido": 3,
        "dataPedido": "31/09/2021",
        "statusPedido": "Aguardando",
        "pessoa": {
            "id": 3,
            "nomeCompleto": "Roan professor",
            "email": "roan@professor",
            "endereco": "Rua"
        },
        "produto": [
            {
                "idProduto": 8,
                "descricaoProduto": "suco",
                "quantidadeProduto": 1,
                "precoProduto": 6.80,
                "totalProduto": 6.80
            },
            {
                "idProduto": 6,
                "descricaoProduto": "coco-cola",
                "quantidadeProduto": 1,
                "precoProduto": 2.50,
                "totalProduto": 2.50
            },
            {
                "idProduto": 4,
                "descricaoProduto": "x-salada",
                "quantidadeProduto": 2,
                "precoProduto": 8.00,
                "totalProduto": 16.00
            }
        ],
        "pagamento": {
            "idTransacao": 99988789,
            "numeroCartao": 886579879,
            "vencimentoCartao": "05/2028",
            "bandeira": "Amex"
        }
    }
]


## Endpoint save

    Possibilita ao usuario salvar um pedido (Order)

    OBS.: O mesmo irá retornar o URL para acessar o pedido salvo

### Exemplo de utilização

    http://localhost:8080/pedido/save

    Corpo da requisição:

   {
        "idPedido": 4,
        "dataPedido": "01/10/2021",
        "statusPedido": "Aberto",
        "pessoa": {
            "id": 1,
            "nomeCompleto": "joao ninguem",
            "email": "joaoninguem@uol.com.br",
            "endereco": "ribeiro de lima"
        },
        "produto": [
            {
                "idProduto": 1,
                "descricaoProduto": "refrigerante",
                "quantidadeProduto": 1,
                "precoProduto": 4.50,
                "totalProduto": 4.50
            },
            {
                "idProduto": 2,
                "descricaoProduto": "Agua",
                "quantidadeProduto": 1,
                "precoProduto": 2.50,
                "totalProduto": 2.50
            }
        ],
        "pagamento": {
            "idTransacao": 9999923,
            "numeroCartao": 445126584,
            "vencimentoCartao": "05/2027",
            "bandeira": "MasterCard"
        }
    }

  ** Response:
  
    http://localhost:8080/pedido//save/4

## Endpoint update

    Possibilita ao usuario atualizar os dados de um pedido (Order), através do ID

### Exemplo de utilização

    http://localhost:8080/pedido/update?id=3

    Corpo da requisição:

    {
        "dataPedido": "2021-10-01",
        "statusPedido": "Aberto",
        "pessoa": {
            "endereco": "lab coding"
        },
        "produto": [
            {
                "idProduto": 5,
                "descricaoProduto": "coca-cola",
                "quantidadeProduto": 2,
                "precoProduto": 2.50
            }
        ],
        "pagamento": {
            "idTransacao": 889877,
            "numeroCartao": 333568897,
            "vencimentoCartao": "09/2029",
            "bandeira": "MasterCard"
        }
    }
    
    ** Response
      
      {
    "idPedido": 3,
    "dataPedido": "2021-10-01",
    "statusPedido": "Aguardando",
    "pessoa": {
        "id": 3,
        "nomeCompleto": "Roan professor",
        "email": "roan@professor",
        "endereco": "lab coding"
    },
    "produto": [
        {
            "idProduto": 5,
            "descricaoProduto": "coca-cola",
            "quantidadeProduto": 2,
            "precoProduto": 2.50,
            "totalProduto": 5.00
        },
        {
            "idProduto": 6,
            "descricaoProduto": "coca-cola",
            "quantidadeProduto": 2,
            "precoProduto": 2.50,
            "totalProduto": 5.00
        },
        {
            "idProduto": 4,
            "descricaoProduto": "coca-cola",
            "quantidadeProduto": 2,
            "precoProduto": 2.50,
            "totalProduto": 5.00
        }
    ],
    "pagamento": {
        "idTransacao": 889877,
        "numeroCartao": 333568897,
        "vencimentoCartao": "09/2029",
        "bandeira": "MasterCard"
    }
}

## Endpoint delete

    Possibilita ao usuario deletar um pedido (Order), através do ID 

### Exemplo de utilização

    http://localhost:8080/pedido/delete/4

    OBS.: O mesmo irá retornar o pedido no formato JSON, após exclui-lo
    
    ** Pedido true excluído.

