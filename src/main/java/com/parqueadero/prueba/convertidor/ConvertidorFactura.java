package com.parqueadero.prueba.convertidor;

import com.parqueadero.prueba.entidad.EntidadFactura;
import com.parqueadero.prueba.modelo.Factura;

public class ConvertidorFactura {

    public static EntidadFactura convertirDeModeloAEntidad(Factura factura){
        if (factura == null){
            return null;
        }else {
            return new EntidadFactura(factura.getId(),factura.getValorTotal());
        }
    }
}
