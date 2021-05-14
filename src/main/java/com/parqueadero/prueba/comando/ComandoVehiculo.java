package com.parqueadero.prueba.comando;

import com.parqueadero.prueba.modelo.TipoVehiculo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoVehiculo {

    private Long id;
    private TipoVehiculo tipoVehiculo;
    private String placa;
    private String color;
    private boolean estado;
}
