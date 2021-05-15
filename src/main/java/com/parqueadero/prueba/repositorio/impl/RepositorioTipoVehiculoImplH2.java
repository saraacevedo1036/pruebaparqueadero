package com.parqueadero.prueba.repositorio.impl;

import com.parqueadero.prueba.entidad.EntidadTipoVehiculo;
import com.parqueadero.prueba.repositorio.interfazimpl.RepositorioTipoVehiculo;
import com.parqueadero.prueba.repositorio.jpa.RepositorioTipoVehiculoJPA;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioTipoVehiculoImplH2 implements RepositorioTipoVehiculo {

    private final RepositorioTipoVehiculoJPA repositorioTipoVehiculoJPA;

    public RepositorioTipoVehiculoImplH2(RepositorioTipoVehiculoJPA repositorioTipoVehiculoJPA) {
        this.repositorioTipoVehiculoJPA = repositorioTipoVehiculoJPA;
    }

    @Override
    public List<EntidadTipoVehiculo> listarTodo() {
        return repositorioTipoVehiculoJPA.findAll();
    }
}
