package com.parqueadero.prueba.excepcion;

public class ExcepcionVehiculoExistente extends RuntimeException{

    public ExcepcionVehiculoExistente(String message) {
        super(message);
    }
}
