package com.parqueadero.prueba.convertidor;

import com.parqueadero.prueba.entidad.EntidadMovimiento;
import com.parqueadero.prueba.modelo.Movimiento;

import java.util.List;

public class ConvertidorMovimiento {

    public static EntidadMovimiento convertirDeModeloAEntidad(Movimiento movimiento){
        return new EntidadMovimiento(movimiento.getId(), movimiento.getHoraIngreso(), movimiento.getHoraSalida(), ConvertidorVehiculo.convertirDeModeloAEntidad(movimiento.getVehiculo())
                , ConvertidorTarifa.convertirDeModeloAEntidad(movimiento.getTarifa()), ConvertidorFactura.convertirDeModeloAEntidad(movimiento.getFactura()));
    }

    public static Movimiento convertirDeEntidadAModelo(EntidadMovimiento entidadMovimiento){
        return new Movimiento(entidadMovimiento.getId(), entidadMovimiento.getHoraIngreso(), entidadMovimiento.getHoraSalida(), ConvertidorVehiculo.convertirDeEntidadAModelo(entidadMovimiento.getVehiculo()), ConvertidorTarifa.convertirDeEntidadAModelo(entidadMovimiento.getTarifa()), ConvertidorFactura.convertirDeEntidadAModelo(entidadMovimiento.getFactura()));
    }

    public static List<Movimiento> convertirListaDeEntidadAModelo(List<EntidadMovimiento> entidadMovimientos, List<Movimiento> movimientos){
        entidadMovimientos.forEach(temporal -> {
            Movimiento movimiento = ConvertidorMovimiento.convertirDeEntidadAModelo(temporal);
            movimientos.add(movimiento);
        });
        return movimientos;
    }
}
