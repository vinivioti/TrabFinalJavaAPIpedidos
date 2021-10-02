package br.com.impacta.orderservice.controller;


import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class OrderController {

    @GetMapping("/findById")
    public void searchOrder(@Pathvariable String id){

    }
}
