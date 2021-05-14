package com.parqueadero.prueba.servicio;

import com.parqueadero.prueba.entidad.EntidadMovimiento;
import com.parqueadero.prueba.entidad.EntidadTarifa;
import com.parqueadero.prueba.modelo.Movimiento;
import com.parqueadero.prueba.repositorio.interfazimpl.RepositorioTarifa;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ServicioCalcularValorFactura {

    private final RepositorioTarifa repositorioTarifa;

    public ServicioCalcularValorFactura(RepositorioTarifa repositorioTarifa) {
        this.repositorioTarifa = repositorioTarifa;
    }

    public double calcularHoras(LocalDate fechaIngreso, LocalDate fechaSalida){
        Long horas = fechaSalida.toEpochDay() - fechaIngreso.toEpochDay();
        double horasTotal = horas.doubleValue() /(60 * 60 * 1000);
        return horasTotal;
    }

    public double calcularValorDeFacturaSegunTarifa(EntidadMovimiento movimiento){
        EntidadTarifa entidadTarifa = repositorioTarifa.obtenerTarifa(movimiento.getVehiculo().getEntidadTipoVehiculo().getDescripcion());
        return (entidadTarifa.getValor() * this.calcularHoras(movimiento.getHoraIngreso(), movimiento.getHoraSalida()));
    }
}
