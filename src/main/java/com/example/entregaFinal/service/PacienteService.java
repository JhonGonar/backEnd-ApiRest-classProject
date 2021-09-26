package com.example.entregaFinal.service;

import com.example.entregaFinal.error.PacienteNotFoundException;
import com.example.entregaFinal.model.Paciente;

import java.util.List;

public interface PacienteService {

    public Paciente savePaciente(Paciente paciente);

    public List<Paciente> fecthPacienteList();

    public Paciente fetchPacienteById(Long pacienteId) throws PacienteNotFoundException;

    public void deletePacienteById(Long pacienteId);

    public Paciente updatePaciente(Long pacienteId, Paciente paciente);

    public Paciente fectchPacienteByMatricula(String pacientoDni);
}
