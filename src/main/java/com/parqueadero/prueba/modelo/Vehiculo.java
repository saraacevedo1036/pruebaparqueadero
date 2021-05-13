package com.parqueadero.prueba.modelo;

public class Vehiculo {

    private Long id;
    private TipoVehiculo tipoVehiculo;
    private String placa;
    private String color;

    public Vehiculo(Long id, TipoVehiculo tipoVehiculo, String placa, String color) {
        this.id = id;
        this.tipoVehiculo = tipoVehiculo;
        this.placa = placa;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getColor() {
        return color;
    }
}
