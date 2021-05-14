package com.parqueadero.prueba.repositorio.interfazimpl;

import com.parqueadero.prueba.entidad.EntidadMovimiento;
import com.parqueadero.prueba.modelo.Movimiento;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioMovimiento {

    void guardar(Movimiento movimiento);
    void guardarActualizadoSalida(EntidadMovimiento movimiento);
    EntidadMovimiento buscarPorId(Long id);
}
