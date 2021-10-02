package br.com.impacta.orderservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ParametroIncorretoException extends IllegalArgumentException{

    public ParametroIncorretoException(String mensagem){
        super(mensagem);
    }
}
