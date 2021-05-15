package com.parqueadero.prueba.convertidor;

import com.parqueadero.prueba.entidad.EntidadTarifa;
import com.parqueadero.prueba.modelo.Tarifa;

public class ConvertidorTarifa {

    public static EntidadTarifa convertirDeModeloAEntidad(Tarifa tarifa){
        if (tarifa == null){
            return null;
        }else{
            return new EntidadTarifa(tarifa.getId(), tarifa.getValor(), tarifa.getDescripcion());
        }
    }

    public static Tarifa convertirDeEntidadAModelo(EntidadTarifa entidadTarifa){
        if (entidadTarifa == null){
            return null;
        }else {
            return new Tarifa(entidadTarifa.getId(), entidadTarifa.getValor(), entidadTarifa.getDescripcion());
        }
    }
}
