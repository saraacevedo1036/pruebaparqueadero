package com.parqueadero.prueba.manejado;

import com.parqueadero.prueba.comando.ComandoMovimiento;
import com.parqueadero.prueba.repositorio.jpa.RepositorioVehiculoJPA;
import com.parqueadero.prueba.servicio.ServicioGenerarFactura;
import com.parqueadero.prueba.servicio.ServicioIngresarVehiculo;
import com.parqueadero.prueba.servicio.ServicioSalidaDeVehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class ManejadorMovimiento {

    private final ServicioIngresarVehiculo servicioIngresarVehiculo;
    private final ServicioGenerarFactura servicioGenerarFactura;
    private final ServicioSalidaDeVehiculo servicioSalidaDeVehiculo;
    @Autowired
    private RepositorioVehiculoJPA repositorioVehiculoJPA;

    public ManejadorMovimiento(ServicioIngresarVehiculo servicioIngresarVehiculo, ServicioGenerarFactura servicioGenerarFactura, ServicioSalidaDeVehiculo servicioSalidaDeVehiculo) {
        this.servicioIngresarVehiculo = servicioIngresarVehiculo;
        this.servicioGenerarFactura = servicioGenerarFactura;
        this.servicioSalidaDeVehiculo = servicioSalidaDeVehiculo;
    }

    public void ejecutarIngresoMovimiento(ComandoMovimiento comandoMovimiento){
        servicioIngresarVehiculo.ejecutar(comandoMovimiento);
    }

    public void ejecutarSalidaMovimiento(String fechaSalida, Long id){
        servicioSalidaDeVehiculo.ejecutar(fechaSalida, id);
    }
}
