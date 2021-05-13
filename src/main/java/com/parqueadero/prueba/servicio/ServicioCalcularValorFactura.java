package com.parqueadero.prueba.servicio;

import com.parqueadero.prueba.entidad.EntidadTarifa;
import com.parqueadero.prueba.modelo.Movimiento;
import com.parqueadero.prueba.repositorio.interfazimpl.RepositorioTarifa;
import org.springframework.stereotype.Service;

@Service
public class ServicioCalcularValorFactura {

    private final RepositorioTarifa repositorioTarifa;

    public ServicioCalcularValorFactura(RepositorioTarifa repositorioTarifa) {
        this.repositorioTarifa = repositorioTarifa;
    }

    public double calcularValorDeFacturaSegunTarifa(Movimiento movimiento){
        EntidadTarifa entidadTarifa = repositorioTarifa.obtenerTarifa(movimiento.getVehiculo().getTipoVehiculo().getDescripcion());
        return (entidadTarifa.getValor() * movimiento.calcularHoras());
    }
}
