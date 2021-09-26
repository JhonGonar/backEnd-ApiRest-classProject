package com.example.entregaFinal.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pacienteId;
    private String pacienteNombre;
    private String pacienteApellido;
    private String pacienteDomicilio;
    @NotBlank(message = "el campo de Dni es obligatorio")
    private String pacienteDni;
    private LocalDate pacienteFechaAlta;
}
