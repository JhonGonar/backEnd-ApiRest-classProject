package com.example.entregaFinal.error;

public class PacienteNotFoundException extends Exception{
    public PacienteNotFoundException() {
        super();
    }

    public PacienteNotFoundException(String message) {
        super(message);
    }

    public PacienteNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public PacienteNotFoundException(Throwable cause) {
        super(cause);
    }

    protected PacienteNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
