package com.example.entregaFinal.service;

import com.example.entregaFinal.error.OdontologoNotFoundException;
import com.example.entregaFinal.model.Odontologo;

import java.util.List;
import java.util.Optional;

public interface OdontologoService {
    public Odontologo saveOdontologo(Odontologo odontologo);

    public List<Odontologo> fetchOdontologoList();

    public Odontologo fetchOdontologoById(Long odontologoId) throws OdontologoNotFoundException;

    public void deleteOdontologoById(Long odontologoId);

    public Odontologo updateOdontologo(Long odontologoId, Odontologo odontologo);

    public Odontologo fectchOdontologoByMatricula(String odontologoMatricula);
}
