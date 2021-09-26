package com.example.entregaFinal.model;

import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "odontologos_tbl",
    uniqueConstraints = @UniqueConstraint(
            name = "odontologoMatricula",
            columnNames = "odontologoMatricula"
    )
)
public class Odontologo {
    @Id
    @SequenceGenerator(
            name = "odontologo_sequence",
            sequenceName = "odontologo_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "odontologo_sequence"
    )
    private Long odontologoId;
    private String odontologoApellido;
    private String odontologoNombre;
    @NotBlank(message = "el campo de matricula es obligatorio")
    @Column(nullable = false)
    private String odontologoMatricula;

}
