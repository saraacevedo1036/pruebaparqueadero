package com.parqueadero.prueba.repositorio.jpa;

import com.parqueadero.prueba.entidad.EntidadMovimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioMovimientoJPA extends JpaRepository<EntidadMovimiento, Long> {
}
