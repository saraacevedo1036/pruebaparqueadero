package com.parqueadero.prueba.entidad;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "vehiculo")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class EntidadVehiculo {

    @Id
    @GeneratedValue
    @Column(name = "id_codigo")
    private Long id;

    @ManyToOne
    @JoinColumn
    private EntidadTipoVehiculo EntidadTipoVehiculo;

    @Column
    private String placa;

    @Column
    private String color;

    @Column
    private boolean estado;

}
