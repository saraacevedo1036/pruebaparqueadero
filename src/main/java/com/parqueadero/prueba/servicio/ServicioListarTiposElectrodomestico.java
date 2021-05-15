package com.parqueadero.prueba.servicio;

import com.parqueadero.prueba.convertidor.ConvertidorTipoVehiculo;
import com.parqueadero.prueba.dto.TipoVehiculoDTO;
import com.parqueadero.prueba.entidad.EntidadTipoVehiculo;
import com.parqueadero.prueba.modelo.TipoVehiculo;
import com.parqueadero.prueba.repositorio.interfazimpl.RepositorioTipoVehiculo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicioListarTiposElectrodomestico {

    private final RepositorioTipoVehiculo repositorioTipoVehiculo;

    public ServicioListarTiposElectrodomestico(RepositorioTipoVehiculo repositorioTipoVehiculo) {
        this.repositorioTipoVehiculo = repositorioTipoVehiculo;
    }

    public List<TipoVehiculoDTO> ejecutar(){
        List<EntidadTipoVehiculo> entidadTipoVehiculos = repositorioTipoVehiculo.listarTodo();
        List<TipoVehiculoDTO> tipoVehiculos = new ArrayList<TipoVehiculoDTO>();
        return ConvertidorTipoVehiculo.convertirListaTipoVehiculoEntidadAModelo(entidadTipoVehiculos, tipoVehiculos);
    }
}
