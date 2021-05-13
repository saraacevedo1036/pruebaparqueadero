package com.parqueadero.prueba.repositorio.jpa;

import com.parqueadero.prueba.entidad.EntidadTarifa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RepositorioTarifaJPA extends JpaRepository<EntidadTarifa, Long> {

    @Query(value = "select * from tarifa where descripcion=:descripcion", nativeQuery = true)
    EntidadTarifa obtenerValorDeTarifaSegunLaDescripcion(@Param("descripcion") String descripcion);
}
