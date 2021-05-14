package com.parqueadero.prueba.servicio;

import com.parqueadero.prueba.comando.ComandoMovimiento;
import com.parqueadero.prueba.excepcion.ExcepcionVehiculoExistente;
import com.parqueadero.prueba.fabrica.FabricaMovimiento;
import com.parqueadero.prueba.modelo.Movimiento;
import com.parqueadero.prueba.repositorio.interfazimpl.RepositorioMovimiento;
import com.parqueadero.prueba.repositorio.jpa.RepositorioVehiculoJPA;
import org.springframework.stereotype.Service;

@Service
public class ServicioIngresarVehiculo {

    private static final String VEHICULO_EXISTENTE = "El vehiculo ya se encuentra en el parqueadero";

    private final RepositorioMovimiento repositorioMovimiento;
    private final FabricaMovimiento fabricaMovimiento;
    private final RepositorioVehiculoJPA repositorioVehiculoJPA;

    public ServicioIngresarVehiculo(RepositorioMovimiento repositorioMovimiento, FabricaMovimiento fabricaMovimiento, RepositorioVehiculoJPA repositorioVehiculoJPA) {
        this.repositorioMovimiento = repositorioMovimiento;
        this.fabricaMovimiento = fabricaMovimiento;
        this.repositorioVehiculoJPA = repositorioVehiculoJPA;
    }

    public void ejecutar(ComandoMovimiento comandoMovimiento){
        if (repositorioVehiculoJPA.validarExistenciaDeVehiculo(comandoMovimiento.getVehiculo().getPlaca(), true) == null){
            repositorioMovimiento.guardar(fabricaMovimiento.crear(comandoMovimiento));
        }else {
            throw new ExcepcionVehiculoExistente(VEHICULO_EXISTENTE);
        }
    }
}
