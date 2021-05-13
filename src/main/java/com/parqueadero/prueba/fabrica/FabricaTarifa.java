package com.parqueadero.prueba.fabrica;

import com.parqueadero.prueba.comando.ComandoTarifa;
import com.parqueadero.prueba.modelo.Tarifa;

public class FabricaTarifa {

    public Tarifa crear(ComandoTarifa comandoTarifa){
        return new Tarifa(comandoTarifa.getId(), comandoTarifa.getValor(), comandoTarifa.getDescripcion());
    }
}
