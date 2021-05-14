package com.parqueadero.prueba.convertidor;

import com.parqueadero.prueba.entidad.EntidadTipoVehiculo;
import com.parqueadero.prueba.entidad.EntidadVehiculo;
import com.parqueadero.prueba.modelo.Vehiculo;
import org.modelmapper.ModelMapper;

public class ConvertidorVehiculo {

    public static EntidadVehiculo convertirDeModeloAEntidad(Vehiculo vehiculo){
        ModelMapper modelMapper = new ModelMapper();
        return new EntidadVehiculo(vehiculo.getId(), modelMapper.map(vehiculo.getTipoVehiculo(), EntidadTipoVehiculo.class), vehiculo.getPlaca(), vehiculo.getColor(), vehiculo.isEstado());
    }
}
