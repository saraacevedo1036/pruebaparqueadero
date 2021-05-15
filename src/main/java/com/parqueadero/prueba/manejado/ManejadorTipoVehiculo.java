package com.parqueadero.prueba.manejado;

import com.parqueadero.prueba.dto.TipoVehiculoDTO;
import com.parqueadero.prueba.entidad.EntidadTipoVehiculo;
import com.parqueadero.prueba.modelo.TipoVehiculo;
import com.parqueadero.prueba.servicio.ServicioListarTiposElectrodomestico;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorTipoVehiculo {

    private final ServicioListarTiposElectrodomestico servicioListarTiposElectrodomestico;

    public ManejadorTipoVehiculo(ServicioListarTiposElectrodomestico servicioListarTiposElectrodomestico) {
        this.servicioListarTiposElectrodomestico = servicioListarTiposElectrodomestico;
    }

    public List<TipoVehiculoDTO> ejecutar(){
        return servicioListarTiposElectrodomestico.ejecutar();
    }
}
