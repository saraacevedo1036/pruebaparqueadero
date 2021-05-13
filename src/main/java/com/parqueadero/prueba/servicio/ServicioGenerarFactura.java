package com.parqueadero.prueba.servicio;

import com.parqueadero.prueba.comando.ComandoFactura;
import com.parqueadero.prueba.comando.ComandoMovimiento;
import com.parqueadero.prueba.excepcion.ExcepcionFechaInvalida;
import com.parqueadero.prueba.fabrica.FabricaFactura;
import com.parqueadero.prueba.fabrica.FabricaMovimiento;
import com.parqueadero.prueba.modelo.Factura;
import com.parqueadero.prueba.modelo.Movimiento;
import org.springframework.stereotype.Service;

@Service
public class ServicioGenerarFactura {
    private static final String FECHA_INVALIDA = "La fecha de salida no puede ser menor a la de ingreso o la fecha no puede ser null o estar vacia";

    private final ServicioCalcularValorFactura servicioCalcularValorFactura;
    private final FabricaFactura fabricaFactura;
    private final FabricaMovimiento fabricaMovimiento;

    public ServicioGenerarFactura(ServicioCalcularValorFactura servicioCalcularValorFactura, FabricaFactura fabricaFactura, FabricaMovimiento fabricaMovimiento) {
        this.servicioCalcularValorFactura = servicioCalcularValorFactura;
        this.fabricaFactura = fabricaFactura;
        this.fabricaMovimiento = fabricaMovimiento;
    }

    public Factura generarFactura(ComandoMovimiento movimiento){
        if(movimiento.getHoraSalida().isBefore(movimiento.getHoraIngreso()) || movimiento.getHoraSalida() == null || "".equals(movimiento.getHoraSalida())){
             throw new ExcepcionFechaInvalida(FECHA_INVALIDA);
        }
        ComandoFactura comandoFactura = new ComandoFactura();
        Movimiento movimientos = this.fabricaMovimiento.crear(movimiento);
        comandoFactura.setValorTotal(servicioCalcularValorFactura.calcularValorDeFacturaSegunTarifa(movimientos));
        Factura factura = this.fabricaFactura.crear(comandoFactura);
        return factura;
    }
}
