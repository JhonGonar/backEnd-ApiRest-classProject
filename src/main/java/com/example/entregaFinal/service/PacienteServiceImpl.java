package com.example.entregaFinal.service;

import com.example.entregaFinal.error.OdontologoNotFoundException;
import com.example.entregaFinal.error.PacienteNotFoundException;
import com.example.entregaFinal.model.Odontologo;
import com.example.entregaFinal.model.Paciente;
import com.example.entregaFinal.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PacienteServiceImpl implements PacienteService{

    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public Paciente savePaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @Override
    public List<Paciente> fecthPacienteList() {
        return pacienteRepository.findAll();
    }

    @Override
    public Paciente fetchPacienteById(Long pacienteId) throws PacienteNotFoundException {
            Optional<Paciente> paciente =
                    pacienteRepository.findById(pacienteId);
            if(!paciente.isPresent()){
                throw new PacienteNotFoundException("El id del paciente, no existe");
            }
            return paciente.get();
    }

    @Override
    public void deletePacienteById(Long pacienteId) {
        pacienteRepository.deleteById(pacienteId);
    }

    @Override
    public Paciente updatePaciente(Long pacienteId, Paciente paciente) {
        Paciente pacienteDB = pacienteRepository.findById(pacienteId).get();
        if(Objects.nonNull(paciente.getPacienteNombre()) &&
                !"".equalsIgnoreCase(paciente.getPacienteNombre())){
            pacienteDB.setPacienteNombre(paciente.getPacienteNombre());
        }
        if(Objects.nonNull(paciente.getPacienteApellido()) &&
                !"".equalsIgnoreCase(paciente.getPacienteApellido())){
            pacienteDB.setPacienteApellido(paciente.getPacienteApellido());
        }
        if(Objects.nonNull(paciente.getPacienteDomicilio()) &&
                !"".equalsIgnoreCase(paciente.getPacienteDomicilio())){
            pacienteDB.setPacienteDomicilio(paciente.getPacienteDomicilio());
        }
        if(Objects.nonNull(paciente.getPacienteDni()) &&
                !"".equalsIgnoreCase(paciente.getPacienteDni())){
            pacienteDB.setPacienteDni(paciente.getPacienteDni());
        }
        if(Objects.nonNull(paciente.getPacienteFechaAlta()) /*&&
                !"".equalsIgnoreCase(paciente.getPacienteFechaAlta())*/){
            pacienteDB.setPacienteFechaAlta(paciente.getPacienteFechaAlta());
        }
        return pacienteRepository.save(pacienteDB);
    }

    @Override
    public Paciente fectchPacienteByMatricula(String pacientoDni) {
        return pacienteRepository.findByPacienteDniIgnoreCase(pacientoDni);
    }
}
