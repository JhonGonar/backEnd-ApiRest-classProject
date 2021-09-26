package com.example.entregaFinal.service;

import com.example.entregaFinal.model.Turno;
import com.example.entregaFinal.repository.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurnoServiceImpl implements TurnoService {

    @Autowired
    private TurnoRepository turnoRepository;
    @Override
    public Turno saveTurno(Turno turno) {
        return turnoRepository.save(turno);
    }
}
