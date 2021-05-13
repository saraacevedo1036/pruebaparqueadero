package com.parqueadero.prueba.comando;

import com.parqueadero.prueba.modelo.Factura;
import com.parqueadero.prueba.modelo.Tarifa;
import com.parqueadero.prueba.modelo.Vehiculo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoMovimiento {

    private Long id;
    private LocalDate horaIngreso;
    private LocalDate horaSalida;
    private Vehiculo vehiculo;
    private Tarifa tarifa;
    private Factura factura;
}
