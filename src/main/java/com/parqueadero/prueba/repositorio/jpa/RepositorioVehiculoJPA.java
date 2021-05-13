package com.parqueadero.prueba.repositorio.jpa;

import com.parqueadero.prueba.entidad.EntidadVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioVehiculoJPA extends JpaRepository <EntidadVehiculo, Long> {
}
