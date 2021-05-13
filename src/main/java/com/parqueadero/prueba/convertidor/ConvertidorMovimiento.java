package com.parqueadero.prueba.convertidor;

import com.parqueadero.prueba.entidad.EntidadMovimiento;
import com.parqueadero.prueba.entidad.EntidadTarifa;
import com.parqueadero.prueba.modelo.Movimiento;
import org.modelmapper.ModelMapper;

public class ConvertidorMovimiento {

    public static EntidadMovimiento convertirDeModeloAEntidad(Movimiento movimiento){
        ModelMapper modelMapper = new ModelMapper();
        return new EntidadMovimiento(movimiento.getId(), movimiento.getHoraIngreso(), movimiento.getHoraSalida(), ConvertidorVehiculo.convertirDeModeloAEntidad(movimiento.getVehiculo())
                , modelMapper.map(movimiento.getTarifa(), EntidadTarifa.class), ConvertidorFactura.convertirDeModeloAEntidad(movimiento.getFactura()));
    }
}
