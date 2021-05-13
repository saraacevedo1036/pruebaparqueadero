package com.parqueadero.prueba.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tarifa")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class EntidadTarifa {

    @Id
    @GeneratedValue
    @Column(name = "id_codigo")
    private Long id;

    @Column
    private double valor;

    @Column
    private String descripcion;
}
