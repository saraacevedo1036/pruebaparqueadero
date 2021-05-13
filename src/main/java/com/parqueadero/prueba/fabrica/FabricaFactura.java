package com.parqueadero.prueba.fabrica;

import com.parqueadero.prueba.comando.ComandoFactura;
import com.parqueadero.prueba.modelo.Factura;

public class FabricaFactura {

    public Factura crear(ComandoFactura comandoFactura){
        return new Factura(comandoFactura.getId(), comandoFactura.getValorTotal());
    }
}
