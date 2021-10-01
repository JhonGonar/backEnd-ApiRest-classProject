package com.example.entregaFinal.controller;

import com.example.entregaFinal.model.Turno;
import com.example.entregaFinal.repository.TurnoRepository;
import com.example.entregaFinal.service.TurnoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
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
