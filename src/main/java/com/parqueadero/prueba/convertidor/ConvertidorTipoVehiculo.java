package com.parqueadero.prueba.convertidor;

import com.parqueadero.prueba.dto.TipoVehiculoDTO;
import com.parqueadero.prueba.entidad.EntidadTipoVehiculo;
import com.parqueadero.prueba.modelo.TipoVehiculo;
import org.modelmapper.ModelMapper;

import java.util.List;

public class ConvertidorTipoVehiculo {

    public static List<TipoVehiculoDTO> convertirListaTipoVehiculoEntidadAModelo(List<EntidadTipoVehiculo> entidadTipoVehiculos, List<TipoVehiculoDTO> tipoVehiculos){
        ModelMapper modelMapper = new ModelMapper();
        entidadTipoVehiculos.forEach(temporal -> {
            TipoVehiculoDTO tipoVehiculo = modelMapper.map(temporal, TipoVehiculoDTO.class);
            tipoVehiculos.add(tipoVehiculo);
        });

        return tipoVehiculos;
    }

    public static TipoVehiculo convertirDeEntidadAModelo(EntidadTipoVehiculo entidadTipoVehiculo){
        return new TipoVehiculo(entidadTipoVehiculo.getId(), entidadTipoVehiculo.getDescripcion());
    }
}
