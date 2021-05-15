package com.parqueadero.prueba.controlador;

import com.parqueadero.prueba.dto.TipoVehiculoDTO;
import com.parqueadero.prueba.manejado.ManejadorTipoVehiculo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/tipo_vehiculo")
public class ControladorTipoVehiculo {

    private final ManejadorTipoVehiculo manejadorTipoVehiculo;

    public ControladorTipoVehiculo(ManejadorTipoVehiculo manejadorTipoVehiculo) {
        this.manejadorTipoVehiculo = manejadorTipoVehiculo;
    }

    @GetMapping()
    public List<TipoVehiculoDTO> listar(){
        return manejadorTipoVehiculo.ejecutar();
    }
}
