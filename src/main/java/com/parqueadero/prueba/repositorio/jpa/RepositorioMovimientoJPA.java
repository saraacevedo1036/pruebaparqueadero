package com.parqueadero.prueba.repositorio.jpa;

import com.parqueadero.prueba.entidad.EntidadMovimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RepositorioMovimientoJPA extends JpaRepository<EntidadMovimiento, Long> {

    @Query(value = "select * from movimiento where id_codigo=:id_codigo", nativeQuery = true)
    EntidadMovimiento buscarMovimientoPorId(@Param("id_codigo") Long id_codigo);
}
