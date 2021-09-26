package com.example.entregaFinal.error;

public class OdontologoNotFoundException extends  Exception{
    public OdontologoNotFoundException() {
        super();
    }

    public OdontologoNotFoundException(String message) {
        super(message);
    }

    public OdontologoNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public OdontologoNotFoundException(Throwable cause) {
        super(cause);
    }

    protected OdontologoNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
