package com.parqueadero.prueba.repositorio.interfazimpl;

import com.parqueadero.prueba.entidad.EntidadTipoVehiculo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioTipoVehiculo {

    List<EntidadTipoVehiculo> listarTodo();
}
