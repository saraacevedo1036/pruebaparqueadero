package com.parqueadero.prueba.manejado;

import com.parqueadero.prueba.comando.ComandoMovimiento;
import com.parqueadero.prueba.modelo.Movimiento;
import com.parqueadero.prueba.servicio.ServicioGenerarFactura;
import com.parqueadero.prueba.servicio.ServicioIngresarVehiculo;
import com.parqueadero.prueba.servicio.ServicioListarVehiculoEnParquedero;
import com.parqueadero.prueba.servicio.ServicioSalidaDeVehiculo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorMovimiento {

    private final ServicioIngresarVehiculo servicioIngresarVehiculo;
    private final ServicioGenerarFactura servicioGenerarFactura;
    private final ServicioSalidaDeVehiculo servicioSalidaDeVehiculo;
    private final ServicioListarVehiculoEnParquedero servicioListarVehiculoEnParquedero;

    public ManejadorMovimiento(ServicioIngresarVehiculo servicioIngresarVehiculo, ServicioGenerarFactura servicioGenerarFactura, ServicioSalidaDeVehiculo servicioSalidaDeVehiculo, ServicioListarVehiculoEnParquedero servicioListarVehiculoEnParquedero) {
        this.servicioIngresarVehiculo = servicioIngresarVehiculo;
        this.servicioGenerarFactura = servicioGenerarFactura;
        this.servicioSalidaDeVehiculo = servicioSalidaDeVehiculo;
        this.servicioListarVehiculoEnParquedero = servicioListarVehiculoEnParquedero;
    }

    public void ejecutarIngresoMovimiento(ComandoMovimiento comandoMovimiento){
        servicioIngresarVehiculo.ejecutar(comandoMovimiento);
    }

    public void ejecutarSalidaMovimiento(String fechaSalida, Long id){
        servicioSalidaDeVehiculo.ejecutar(fechaSalida, id);
    }

    public List<Movimiento> ejecutar(){
        return servicioListarVehiculoEnParquedero.ejecutar();
    }


}
