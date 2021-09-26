package com.example.entregaFinal.controller;

import com.example.entregaFinal.model.Turno;
import com.example.entregaFinal.repository.TurnoRepository;
import com.example.entregaFinal.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TurnoController {
    @Autowired
    private TurnoService turnoService;

    @PostMapping("/turnos")
    public Turno saveTurno(@RequestBody Turno turno){
        return turnoService.saveTurno(turno);
    }
}
