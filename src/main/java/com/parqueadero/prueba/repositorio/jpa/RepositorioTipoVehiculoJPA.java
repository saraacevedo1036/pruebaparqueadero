package com.parqueadero.prueba.repositorio.jpa;

import com.parqueadero.prueba.entidad.EntidadTipoVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioTipoVehiculoJPA extends JpaRepository<EntidadTipoVehiculo, Long> {
}
