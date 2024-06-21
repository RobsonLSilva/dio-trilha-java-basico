package com.robson.desafioUML.exceptions;

import java.io.Serial;

public class EscolhaException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;

    public EscolhaException(String msg){
        super(msg);
    }
}
