package br.com.impacta.orderservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RegistroNaoEncontradoException extends Exception{

    public RegistroNaoEncontradoException(String mensagem){
        super(mensagem);
    }
}
