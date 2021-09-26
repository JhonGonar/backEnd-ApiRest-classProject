package com.example.entregaFinal.repository;

import com.example.entregaFinal.model.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OdontologoRepository extends JpaRepository<Odontologo, Long> {
    public Odontologo findByOdontologoMatricula(String odontologoMatricula);
    public Odontologo findByOdontologoMatriculaIgnoreCase(String odontologoMatricula);
}
