package com.parqueadero.prueba.controlador;

import com.parqueadero.prueba.comando.ComandoMovimiento;
import com.parqueadero.prueba.manejado.ManejadorMovimiento;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/movimiento")
public class ControladorMovimiento {

    private final ManejadorMovimiento manejadorMovimiento;

    public ControladorMovimiento(ManejadorMovimiento manejadorMovimiento) {
        this.manejadorMovimiento = manejadorMovimiento;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void guardarIngresoMovimiento(@RequestBody ComandoMovimiento comandoMovimiento){
        this.manejadorMovimiento.ejecutarIngresoMovimiento(comandoMovimiento);
    }

    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void salidaDeMovimiento(@PathVariable Long id, @RequestBody ComandoMovimiento comandoMovimiento){
        this.manejadorMovimiento.ejecutarSalidaMovimiento(comandoMovimiento, id);
    }
}
