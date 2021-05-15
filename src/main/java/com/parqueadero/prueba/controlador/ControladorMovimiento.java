package com.parqueadero.prueba.controlador;

import com.parqueadero.prueba.comando.ComandoMovimiento;
import com.parqueadero.prueba.manejado.ManejadorMovimiento;
import com.parqueadero.prueba.modelo.Movimiento;
import com.parqueadero.prueba.repositorio.jpa.RepositorioVehiculoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/movimiento")
public class ControladorMovimiento {

    private final ManejadorMovimiento manejadorMovimiento;

    @Autowired
    private RepositorioVehiculoJPA repositorioVehiculoJPA;

    public ControladorMovimiento(ManejadorMovimiento manejadorMovimiento) {
        this.manejadorMovimiento = manejadorMovimiento;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void guardarIngresoMovimiento(@RequestBody ComandoMovimiento comandoMovimiento){
        this.manejadorMovimiento.ejecutarIngresoMovimiento(comandoMovimiento);
    }

    @PutMapping(value = "/{id}/{fechaSalida}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void salidaDeMovimiento(@PathVariable Long id,@PathVariable String fechaSalida){
        this.manejadorMovimiento.ejecutarSalidaMovimiento(fechaSalida, id);
    }

    @GetMapping
    public List<Movimiento> listar(){
        return manejadorMovimiento.ejecutar();
    }
}
