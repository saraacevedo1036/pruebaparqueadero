package com.parqueadero.prueba.repositorio.impl;

import com.parqueadero.prueba.entidad.EntidadTarifa;
import com.parqueadero.prueba.repositorio.interfazimpl.RepositorioTarifa;
import com.parqueadero.prueba.repositorio.jpa.RepositorioTarifaJPA;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioTarifaImplH2 implements RepositorioTarifa {

    private final RepositorioTarifaJPA repositorioTarifaJPA;

    public RepositorioTarifaImplH2(RepositorioTarifaJPA repositorioTarifaJPA) {
        this.repositorioTarifaJPA = repositorioTarifaJPA;
    }

    @Override
    public EntidadTarifa obtenerTarifa(String descripcion) {
        return repositorioTarifaJPA.obtenerValorDeTarifaSegunLaDescripcion(descripcion);
    }
}
