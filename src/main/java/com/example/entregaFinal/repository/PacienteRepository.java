package com.example.entregaFinal.repository;

import com.example.entregaFinal.model.Odontologo;
import com.example.entregaFinal.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    public Paciente findByPacienteDni(String pacienteDni);
    public Paciente findByPacienteDniIgnoreCase(String pacienteDni);
}
