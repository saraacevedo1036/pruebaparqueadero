package com.parqueadero.prueba.repositorio.jpa;

import com.parqueadero.prueba.entidad.EntidadMovimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RepositorioMovimientoJPA extends JpaRepository<EntidadMovimiento, Long> {

    @Query(value = "select * from movimiento where id_codigo=:id_codigo", nativeQuery = true)
    EntidadMovimiento buscarMovimientoPorId(@Param("id_codigo") Long id_codigo);

    @Query(value = "select * from movimiento inner join vehiculo on movimiento.vehiculo_id_codigo = vehiculo.id_codigo where estado =:estado", nativeQuery = true)
    List<EntidadMovimiento> buscarVehiculoEnParqueadero(@Param("estado") boolean estado);
}
