package com.parqueadero.prueba.servicio;

import com.parqueadero.prueba.comando.ComandoMovimiento;
import com.parqueadero.prueba.fabrica.FabricaMovimiento;
import com.parqueadero.prueba.modelo.Movimiento;
import com.parqueadero.prueba.repositorio.interfazimpl.RepositorioMovimiento;
import org.springframework.stereotype.Service;

@Service
public class ServicioIngresarVehiculo {

    private final RepositorioMovimiento repositorioMovimiento;
    private final FabricaMovimiento fabricaMovimiento;

    public ServicioIngresarVehiculo(RepositorioMovimiento repositorioMovimiento, FabricaMovimiento fabricaMovimiento) {
        this.repositorioMovimiento = repositorioMovimiento;
        this.fabricaMovimiento = fabricaMovimiento;
    }

    public void ejecutar(ComandoMovimiento comandoMovimiento){
        repositorioMovimiento.guardar(fabricaMovimiento.crear(comandoMovimiento));
    }
}
