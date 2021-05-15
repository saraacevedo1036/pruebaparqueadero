package com.parqueadero.prueba.modelo;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class Vehiculo {

    private Long id;
    private TipoVehiculo tipoVehiculo;
    private String placa;
    private String color;
    private boolean estado;


    public Vehiculo(Long id, TipoVehiculo tipoVehiculo, String placa, String color, boolean estado) {
        this.id = id;
        this.tipoVehiculo = tipoVehiculo;
        this.placa = placa;
        this.color = color;
        this.estado = estado;
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

    public boolean isEstado() {
        return estado;
    }
}
