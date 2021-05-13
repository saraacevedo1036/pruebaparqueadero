package com.parqueadero.prueba.repositorio.interfazimpl;

import com.parqueadero.prueba.entidad.EntidadTarifa;

public interface RepositorioTarifa {

    EntidadTarifa obtenerTarifa(String descripcion);
}
