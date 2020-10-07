package br.com.fundatec.clinica.exception;

public class InvalidDateException extends RuntimeException{

    public InvalidDateException(String message) {
        super(message);
    }

    public InvalidDateException() {
    }
}
