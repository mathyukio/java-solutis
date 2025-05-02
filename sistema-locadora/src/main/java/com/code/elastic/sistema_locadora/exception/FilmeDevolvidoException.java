package com.code.elastic.sistema_locadora.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class FilmeDevolvidoException extends RuntimeException {

    public FilmeDevolvidoException(String message) {
        super(message);
    }

    public FilmeDevolvidoException(String message, Throwable cause) {
        super(message, cause);
    }

}
