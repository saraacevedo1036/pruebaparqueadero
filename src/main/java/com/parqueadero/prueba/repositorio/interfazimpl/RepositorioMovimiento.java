package com.parqueadero.prueba.repositorio.interfazimpl;

import com.parqueadero.prueba.entidad.EntidadMovimiento;
import com.parqueadero.prueba.modelo.Movimiento;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioMovimiento {

    void guardar(Movimiento movimiento);
    void guardarActualizadoSalida(EntidadMovimiento movimiento);
    EntidadMovimiento buscarPorId(Long id);
    List<EntidadMovimiento> listarTodo(boolean estado);
}
