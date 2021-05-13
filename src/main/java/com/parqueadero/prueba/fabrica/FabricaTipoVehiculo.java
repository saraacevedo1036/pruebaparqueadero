package com.parqueadero.prueba.fabrica;

import com.parqueadero.prueba.comando.ComandoTipoVehiculo;
import com.parqueadero.prueba.modelo.TipoVehiculo;

public class FabricaTipoVehiculo {

    public TipoVehiculo crear(ComandoTipoVehiculo comandoTipoVehiculo){
        return new TipoVehiculo(comandoTipoVehiculo.getId(), comandoTipoVehiculo.getDescripcion());
    }
}
