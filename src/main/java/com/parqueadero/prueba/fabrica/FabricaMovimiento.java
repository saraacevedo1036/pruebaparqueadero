package com.parqueadero.prueba.fabrica;

import com.parqueadero.prueba.comando.ComandoMovimiento;
import com.parqueadero.prueba.modelo.Movimiento;
import org.springframework.stereotype.Component;

@Component
public class FabricaMovimiento {

    public Movimiento crear(ComandoMovimiento comandoMovimiento){
        return new Movimiento(comandoMovimiento.getId(),comandoMovimiento.getHoraIngreso(),comandoMovimiento.getHoraSalida()
                ,comandoMovimiento.getVehiculo(),comandoMovimiento.getTarifa(),comandoMovimiento.getFactura());
    }
}
