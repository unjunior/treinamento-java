package br.com.desafio.dscliente.service.exceptions;

public class RecursoNaoEncontrado extends RuntimeException{

    public RecursoNaoEncontrado(String msg) {
        super(msg);
    }
}
