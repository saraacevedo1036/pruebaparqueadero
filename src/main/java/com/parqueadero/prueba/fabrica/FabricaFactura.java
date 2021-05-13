package com.parqueadero.prueba.fabrica;

import com.parqueadero.prueba.comando.ComandoFactura;
import com.parqueadero.prueba.modelo.Factura;
import org.springframework.stereotype.Component;

@Component
public class FabricaFactura {

    public Factura crear(ComandoFactura comandoFactura){
        return new Factura(comandoFactura.getId(), comandoFactura.getValorTotal());
    }
}
