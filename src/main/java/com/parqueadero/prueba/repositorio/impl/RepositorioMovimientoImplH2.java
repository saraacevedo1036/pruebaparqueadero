package com.parqueadero.prueba.repositorio.impl;

import com.parqueadero.prueba.convertidor.ConvertidorMovimiento;
import com.parqueadero.prueba.entidad.EntidadMovimiento;
import com.parqueadero.prueba.modelo.Movimiento;
import com.parqueadero.prueba.repositorio.interfazimpl.RepositorioMovimiento;
import com.parqueadero.prueba.repositorio.jpa.RepositorioMovimientoJPA;
import com.parqueadero.prueba.repositorio.jpa.RepositorioTarifaJPA;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioMovimientoImplH2 implements RepositorioMovimiento {

    private final RepositorioMovimientoJPA repositorioMovimientoJPA;
    private final RepositorioTarifaJPA repositorioTarifaJPA;

    public RepositorioMovimientoImplH2(RepositorioMovimientoJPA repositorioMovimientoJPA, RepositorioTarifaJPA repositorioTarifaJPA) {
        this.repositorioMovimientoJPA = repositorioMovimientoJPA;
        this.repositorioTarifaJPA = repositorioTarifaJPA;
    }

    @Override
    public void guardar(Movimiento movimiento) {
        EntidadMovimiento entidadMovimiento = ConvertidorMovimiento.convertirDeModeloAEntidad(movimiento);
        entidadMovimiento.setTarifa(repositorioTarifaJPA.obtenerValorDeTarifaSegunLaDescripcion(entidadMovimiento.getVehiculo().getEntidadTipoVehiculo().getDescripcion()));
        repositorioMovimientoJPA.save(entidadMovimiento);
    }

    @Override
    public void guardarActualizadoSalida(EntidadMovimiento movimiento) {
        repositorioMovimientoJPA.save(movimiento);
    }

    @Override
    public EntidadMovimiento buscarPorId(Long id) {
      return repositorioMovimientoJPA.buscarMovimientoPorId(id);
    }

    @Override
    public List<EntidadMovimiento> listarTodo(boolean estado) {
        return repositorioMovimientoJPA.buscarVehiculoEnParqueadero(estado);
    }
}
