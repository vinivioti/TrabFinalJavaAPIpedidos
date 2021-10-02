package br.com.impacta.orderservice.exception;

import br.com.impacta.orderservice.model.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@RestControllerAdvice
public class RestResponseExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ParametroIncorretoException.class)
    public final ResponseEntity<Object> handleParametroIncorreto(ParametroIncorretoException e, WebRequest req){
        Response ex = new Response(LocalDateTime.now(), e.getMessage(), req.getDescription(false));

        return new ResponseEntity<>(ex, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(RegistroNaoEncontradoException.class)
    public final ResponseEntity<Object> handleRegistroNaoEncontrado(RegistroNaoEncontradoException e, WebRequest req){
        Response ex = new Response(LocalDateTime.now(), e.getMessage(), req.getDescription(false));

        return new ResponseEntity<>(ex, HttpStatus.NOT_FOUND);
    }

}
