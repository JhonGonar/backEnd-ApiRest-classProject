package com.example.entregaFinal.service;

import com.example.entregaFinal.error.OdontologoNotFoundException;
import com.example.entregaFinal.model.Odontologo;
import com.example.entregaFinal.repository.OdontologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class OdontologoServiceImpl implements OdontologoService{

    @Autowired
    private OdontologoRepository odontologoRepository;

    @Override
    public Odontologo saveOdontologo(Odontologo odontologo) {
        return odontologoRepository.save(odontologo);
    }

    @Override
    public List<Odontologo> fetchOdontologoList() {
        return odontologoRepository.findAll();
    }

    @Override
    public Odontologo fetchOdontologoById(Long odontologoId) throws OdontologoNotFoundException {
        Optional<Odontologo> odontologo =
                odontologoRepository.findById(odontologoId);
        if(!odontologo.isPresent()){
            throw new OdontologoNotFoundException("El id del odontologo, no existe");
        }
        return odontologo.get();
    }

    @Override
    public void deleteOdontologoById(Long odontologoId) {
        odontologoRepository.deleteById(odontologoId);
    }

    @Override
    public Odontologo updateOdontologo(Long odontologoId, Odontologo odontologo) {
        Odontologo odoDB = odontologoRepository.findById(odontologoId).get();
        if(Objects.nonNull(odontologo.getOdontologoApellido()) &&
        !"".equalsIgnoreCase(odontologo.getOdontologoApellido())){
            odoDB.setOdontologoApellido(odontologo.getOdontologoApellido());
        }
        if(Objects.nonNull(odontologo.getOdontologoNombre()) &&
                !"".equalsIgnoreCase(odontologo.getOdontologoNombre())){
            odoDB.setOdontologoNombre(odontologo.getOdontologoNombre());
        }
        if(Objects.nonNull(odontologo.getOdontologoMatricula()) &&
                !"".equalsIgnoreCase(odontologo.getOdontologoMatricula())){
            odoDB.setOdontologoMatricula(odontologo.getOdontologoMatricula());
        }
        return odontologoRepository.save(odoDB);
    }

    @Override
    public Odontologo fectchOdontologoByMatricula(String odontologoMatricula) {
        return odontologoRepository.findByOdontologoMatriculaIgnoreCase(odontologoMatricula);
    }
}
