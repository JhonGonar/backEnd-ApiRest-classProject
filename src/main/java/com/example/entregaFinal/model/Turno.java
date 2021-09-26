package com.example.entregaFinal.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Turno {
    @Id
    @SequenceGenerator(
            name = "turno_sequence",
            sequenceName = "turno_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "turno_sequence"
    )
    private Long turnoId;
    private LocalDate turnoFecha;
    private LocalTime turnoHora;
    @ManyToOne()
    @JoinColumn(
            name="paciente_id",
            referencedColumnName = "pacienteId"
    )
    private Paciente turnoPaciente;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name="odontologo_id",
            referencedColumnName = "odontologoId"
    )
    private Odontologo turnoOdontologo;
}
