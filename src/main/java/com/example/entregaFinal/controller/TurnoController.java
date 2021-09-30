package com.example.entregaFinal.controller;

import com.example.entregaFinal.model.Turno;
import com.example.entregaFinal.repository.TurnoRepository;
import com.example.entregaFinal.service.TurnoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TurnoController {
    @Autowired
    private TurnoService turnoService;

    private final Logger LOGGER =
            LoggerFactory.getLogger(OdontologoController.class);

    @PostMapping("/turnos")
    public Turno saveTurno(@RequestBody Turno turno){
        return turnoService.saveTurno(turno);
    }

    @GetMapping("/turnos")
    public List<Turno> fetchTurnoList(){
        LOGGER.info("fecthing turnos from TurnoController");
        return turnoService.fetchTurnoList();
    }
}
