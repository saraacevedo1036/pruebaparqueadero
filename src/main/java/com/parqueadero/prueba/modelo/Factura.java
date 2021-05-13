package com.parqueadero.prueba.modelo;

public class Factura {

    private Long id;
    private double valorTotal;

    public Factura(Long id, double valorTotal) {
        this.id = id;
        this.valorTotal = valorTotal;
    }

    public Long getId() {
        return id;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
