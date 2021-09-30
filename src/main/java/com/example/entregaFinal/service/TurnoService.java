package com.example.entregaFinal.service;

import com.example.entregaFinal.model.Turno;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TurnoService {
    public Turno saveTurno(Turno turno);

    public List<Turno> fetchTurnoList();
}
