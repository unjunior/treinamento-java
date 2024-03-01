package br.com.desafio.dscliente.controller.handlers;

import br.com.desafio.dscliente.dto.CustomError;
import br.com.desafio.dscliente.service.exceptions.RecursoNaoEncontrado;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ControllerExceptionHandler {

    // recurso não encontrado - id não encontrados
    @ExceptionHandler(RecursoNaoEncontrado.class)
    public ResponseEntity<CustomError> recursoNaoEncontrado(RecursoNaoEncontrado e, HttpServletRequest request){
        HttpStatus status = HttpStatus.NOT_FOUND;
        CustomError err = new CustomError(Instant.now(), status.value(), e.getMessage(), request.getRequestURI());
        return  ResponseEntity.status(status).body(err);
    }
}
