package com.parqueadero.prueba.fabrica;

import com.parqueadero.prueba.comando.ComandoVehiculo;
import com.parqueadero.prueba.modelo.Vehiculo;

public class FabricaVehiculo {

    public Vehiculo crear(ComandoVehiculo vehiculo){
        return new Vehiculo(vehiculo.getId(), vehiculo.getTipoVehiculo(), vehiculo.getPlaca(), vehiculo.getColor());
    }
}
