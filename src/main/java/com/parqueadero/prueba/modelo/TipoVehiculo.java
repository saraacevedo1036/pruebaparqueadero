package com.parqueadero.prueba.modelo;

public class TipoVehiculo {

    private Long id;
    private String descripcion;

    public TipoVehiculo(Long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
