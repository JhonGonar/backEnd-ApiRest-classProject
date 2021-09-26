package com.example.entregaFinal.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Odontologo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long odontologoId;
    private String odontologoApellido;
    private String odontologoNombre;
    @NotBlank(message = "el campo de matricula es obligatorio")
    private String odontologoMatricula;

}
