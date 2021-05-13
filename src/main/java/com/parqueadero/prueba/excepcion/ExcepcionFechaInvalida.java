package com.parqueadero.prueba.excepcion;

public class ExcepcionFechaInvalida extends RuntimeException{

    public ExcepcionFechaInvalida(String message) {
        super(message);
    }
}
