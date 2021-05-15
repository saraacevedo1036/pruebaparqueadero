package com.parqueadero.prueba.servicio;

import com.parqueadero.prueba.convertidor.ConvertidorMovimiento;
import com.parqueadero.prueba.entidad.EntidadMovimiento;
import com.parqueadero.prueba.modelo.Movimiento;
import com.parqueadero.prueba.repositorio.interfazimpl.RepositorioMovimiento;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicioListarVehiculoEnParquedero {

    private final RepositorioMovimiento repositorioMovimiento;

    public ServicioListarVehiculoEnParquedero(RepositorioMovimiento repositorioMovimiento) {
        this.repositorioMovimiento = repositorioMovimiento;
    }

    public List<Movimiento> ejecutar(){
        List<EntidadMovimiento> entidadMovimientos = repositorioMovimiento.listarTodo(true);
        List<Movimiento> movimientos = new ArrayList<Movimiento>();
        return ConvertidorMovimiento.convertirListaDeEntidadAModelo(entidadMovimientos,movimientos);
    }
}
