package com.parqueadero.prueba.servicio;

import com.parqueadero.prueba.convertidor.ConvertidorFactura;
import com.parqueadero.prueba.entidad.EntidadMovimiento;
import com.parqueadero.prueba.excepcion.ExcepcionVehiculoExistente;
import com.parqueadero.prueba.repositorio.interfazimpl.RepositorioMovimiento;
import com.parqueadero.prueba.repositorio.jpa.RepositorioVehiculoJPA;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ServicioSalidaDeVehiculo {

    private static final String VEHICULO_NO_ENCONTRADO = "El vehiculo no se encuentra en el parqueadero";

    private final RepositorioMovimiento repositorioMovimiento;
    private final ServicioGenerarFactura servicioGenerarFactura;
    private final RepositorioVehiculoJPA repositorioVehiculoJPA;

    public ServicioSalidaDeVehiculo(RepositorioMovimiento repositorioMovimiento, ServicioGenerarFactura servicioGenerarFactura, RepositorioVehiculoJPA repositorioVehiculoJPA) {
        this.repositorioMovimiento = repositorioMovimiento;
        this.servicioGenerarFactura = servicioGenerarFactura;
        this.repositorioVehiculoJPA = repositorioVehiculoJPA;
    }

    public LocalDate convertirLaFecha(String fecha){
        return  LocalDate.parse(fecha);
    }

    public void ejecutar(String fechaSalida, Long id){
        EntidadMovimiento entidadMovimiento = repositorioMovimiento.buscarPorId(id);
        if (repositorioVehiculoJPA.validarExistenciaDeVehiculo(entidadMovimiento.getVehiculo().getPlaca(), true) != null){
            entidadMovimiento.setHoraSalida(this.convertirLaFecha(fechaSalida));
            entidadMovimiento.getVehiculo().setEstado(false);
            entidadMovimiento.setFactura(ConvertidorFactura.convertirDeModeloAEntidad(servicioGenerarFactura.generarFactura(entidadMovimiento)));
            repositorioMovimiento.guardarActualizadoSalida(entidadMovimiento);
        }else {
            throw new ExcepcionVehiculoExistente(VEHICULO_NO_ENCONTRADO);
        }

    }
}
