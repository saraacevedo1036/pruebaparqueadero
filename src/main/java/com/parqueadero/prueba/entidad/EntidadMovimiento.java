package com.parqueadero.prueba.entidad;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.parqueadero.prueba.modelo.Factura;
import com.parqueadero.prueba.modelo.Tarifa;
import com.parqueadero.prueba.modelo.Vehiculo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "movimiento")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class EntidadMovimiento {

    @Id
    @GeneratedValue
    @Column(name = "id_codigo")
    private Long id;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd")
    private LocalDate horaIngreso;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd")
    private LocalDate horaSalida;

    @OneToOne(cascade = CascadeType.ALL)
    private EntidadVehiculo vehiculo;

    @OneToOne
    private EntidadTarifa tarifa;

    @OneToOne(cascade = CascadeType.ALL)
    private EntidadFactura factura;
}
