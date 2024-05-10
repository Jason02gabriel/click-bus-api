package com.biel.clickbus.exception;

public class CItyNotFoundException extends RuntimeException {

    public CItyNotFoundException(String msg){
        super(msg);
    }

    public CItyNotFoundException(String msg, Throwable cause){
        super(msg, cause);
    }
}
