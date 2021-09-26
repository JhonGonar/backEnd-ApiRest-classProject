package com.example.entregaFinal.controller;

import com.example.entregaFinal.error.OdontologoNotFoundException;
import com.example.entregaFinal.error.PacienteNotFoundException;
import com.example.entregaFinal.model.Odontologo;
import com.example.entregaFinal.model.Paciente;
import com.example.entregaFinal.service.PacienteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    private final Logger LOGGER =
            LoggerFactory.getLogger(PacienteController.class);

    @PostMapping("/pacientes")
    public Paciente savePaciente(@Valid @RequestBody Paciente paciente){
        LOGGER.info("saving Paciente from PacienteController");
        return pacienteService.savePaciente(paciente);
    }

    @GetMapping("/pacientes")
    public List<Paciente> fecthPacienteList(){
        LOGGER.info("fecthing pacientes from PacienteController");
        return pacienteService.fecthPacienteList();
    }

    @GetMapping("/pacientes/{id}")
    public Paciente fetchPacienteById(@PathVariable("id") Long pacienteId) throws PacienteNotFoundException {
        LOGGER.info("fecthing paciente by Id from PacienteController");
        return pacienteService.fetchPacienteById(pacienteId);
    }
    @DeleteMapping("/pacientes/{id}")
    public String deletePacienteById(@PathVariable("id") Long pacienteId){
        LOGGER.info("deleting paciente by Id from PacienteController");
        pacienteService.deletePacienteById(pacienteId);
        return "Paciente suprimido correctamente";
    }
    @PutMapping("/pacientes/{id}")
    public Paciente updatePaciente(@PathVariable("id") Long pacienteId,
                                       @RequestBody Paciente paciente){
        LOGGER.info("updating paciente by Id from PacienteController");
        return pacienteService.updatePaciente(pacienteId, paciente);
    }
    @GetMapping("/pacientes/dni/{dni}")
    public Paciente fectchPacienteByMatricula(@PathVariable("dni") String pacientoDni){
        return pacienteService.fectchPacienteByMatricula(pacientoDni);
    }
}

