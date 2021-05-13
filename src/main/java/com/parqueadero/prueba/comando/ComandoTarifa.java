package com.parqueadero.prueba.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoTarifa {

    private Long id;
    private double valor;
    private String descripcion;
}
