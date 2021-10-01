package com.example.entregaFinal.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Paciente {
    @Id
    @SequenceGenerator(
            name = "paciente_sequence",
            sequenceName = "paciente_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "paciente_sequence"
    )
    private Long pacienteId;
    private String pacienteNombre;
    private String pacienteApellido;
    private String pacienteDomicilio;
    @NotBlank(message = "el campo de Dni es obligatorio")
    private String pacienteDni;
    private LocalDate pacienteFechaAlta;
}
