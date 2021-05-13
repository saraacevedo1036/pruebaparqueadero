package com.parqueadero.prueba.modelo;

import java.time.LocalDate;

public class Movimiento {

    private Long id;
    private LocalDate horaIngreso;
    private LocalDate horaSalida;
    private Vehiculo vehiculo;
    private Tarifa tarifa;
    private Factura factura;

    public Movimiento(Long id, LocalDate horaIngreso, LocalDate horaSalida, Vehiculo vehiculo, Tarifa tarifa, Factura factura) {
        this.id = id;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
        this.vehiculo = vehiculo;
        this.tarifa = tarifa;
        this.factura = factura;
    }

    public Movimiento() {
    }

    public Long getId() {
        return id;
    }

    public LocalDate getHoraIngreso() {
        return horaIngreso;
    }

    public LocalDate getHoraSalida() {
        return horaSalida;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public Factura getFactura() {
        return factura;
    }

    public double calcularHoras(){
        Long horas = this.horaSalida.toEpochDay() - this.horaIngreso.toEpochDay();
        double horasTotal = horas.doubleValue() /(60 * 60 * 1000);
        return horasTotal;
    }
}
