package com.parqueadero.prueba.repositorio.jpa;

import com.parqueadero.prueba.entidad.EntidadVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RepositorioVehiculoJPA extends JpaRepository <EntidadVehiculo, Long> {

    @Query(value = "select * from vehiculo where placa=:placa and estado=:estado", nativeQuery = true)
    EntidadVehiculo validarExistenciaDeVehiculo(@Param("placa") String placa, @Param("estado")boolean estado);

    @Query(value = "delete from vehiculo where id_codigo=:id_codigo", nativeQuery = true)
    void eliminarVehiculoDeLaBase(@Param("id_codigo") Long id_codigo);
}
