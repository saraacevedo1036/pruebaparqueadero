package com.parqueadero.prueba.modelo;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class Tarifa {

    private Long id;
    private double valor;
    private String descripcion;

    public Tarifa(Long id, double valor, String descripcion) {
        this.id = id;
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
