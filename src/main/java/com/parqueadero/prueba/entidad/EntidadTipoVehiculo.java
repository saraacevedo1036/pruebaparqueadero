package com.parqueadero.prueba.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tipo_vehiculo")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class EntidadTipoVehiculo {

    @Id
    @GeneratedValue
    @Column(name = "id_codigo")
    private Long id;

    @Column(nullable = false, length = 255)
    private String descripcion;
}
