package com.parqueadero.prueba.repositorio.impl;

import com.parqueadero.prueba.convertidor.ConvertidorMovimiento;
import com.parqueadero.prueba.entidad.EntidadMovimiento;
import com.parqueadero.prueba.modelo.Movimiento;
import com.parqueadero.prueba.repositorio.interfazimpl.RepositorioMovimiento;
import com.parqueadero.prueba.repositorio.jpa.RepositorioMovimientoJPA;
import com.parqueadero.prueba.repositorio.jpa.RepositorioVehiculoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioMovimientoImplH2 implements RepositorioMovimiento {

    private final RepositorioMovimientoJPA repositorioMovimientoJPA;

    @Autowired
    private RepositorioVehiculoJPA repositorioVehiculoJPA;

    public RepositorioMovimientoImplH2(RepositorioMovimientoJPA repositorioMovimientoJPA) {
        this.repositorioMovimientoJPA = repositorioMovimientoJPA;
    }

    @Override
    public void guardar(Movimiento movimiento) {
        repositorioMovimientoJPA.save(ConvertidorMovimiento.convertirDeModeloAEntidad(movimiento));
    }

    @Override
    public void guardarActualizadoSalida(EntidadMovimiento movimiento) {
        repositorioMovimientoJPA.save(movimiento);
    }

    @Override
    public EntidadMovimiento buscarPorId(Long id) {
      return repositorioMovimientoJPA.buscarMovimientoPorId(id);
    }
}
