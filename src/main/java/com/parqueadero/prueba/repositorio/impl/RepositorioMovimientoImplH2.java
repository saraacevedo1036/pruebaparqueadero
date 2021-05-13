package com.parqueadero.prueba.repositorio.impl;

import com.parqueadero.prueba.convertidor.ConvertidorMovimiento;
import com.parqueadero.prueba.entidad.EntidadMovimiento;
import com.parqueadero.prueba.modelo.Movimiento;
import com.parqueadero.prueba.repositorio.interfazimpl.RepositorioMovimiento;
import com.parqueadero.prueba.repositorio.jpa.RepositorioMovimientoJPA;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioMovimientoImplH2 implements RepositorioMovimiento {

    private final RepositorioMovimientoJPA repositorioMovimientoJPA;

    public RepositorioMovimientoImplH2(RepositorioMovimientoJPA repositorioMovimientoJPA) {
        this.repositorioMovimientoJPA = repositorioMovimientoJPA;
    }

    @Override
    public void guardar(Movimiento movimiento) {
        repositorioMovimientoJPA.save(ConvertidorMovimiento.convertirDeModeloAEntidad(movimiento));
    }

    public void guardarActualizado(Movimiento movimiento){
        EntidadMovimiento entidadMovimiento = ConvertidorMovimiento.convertirDeModeloAEntidad(movimiento);
    }
}
