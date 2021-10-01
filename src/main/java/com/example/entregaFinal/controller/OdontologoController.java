package com.example.entregaFinal.controller;

import com.example.entregaFinal.error.OdontologoNotFoundException;
import com.example.entregaFinal.model.Odontologo;
import com.example.entregaFinal.service.OdontologoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class OdontologoController {



    @Autowired
    private OdontologoService odontologoService;

    private final Logger LOGGER =
            LoggerFactory.getLogger(OdontologoController.class);

    @PostMapping("/odontologos")
    public Odontologo saveOdontologo(@Valid @RequestBody Odontologo odontologo){
        LOGGER.info("saving Odontologo from OdontoController");
        return odontologoService.saveOdontologo(odontologo);
    }

    @GetMapping("/odontologos")
    public List<Odontologo> fecthOdontologoList(){
        LOGGER.info("fecthing Odontologos from OdontoController");
    return odontologoService.fetchOdontologoList();
    }

    @GetMapping("/odontologos/{id}")
    public Odontologo fetchOdontologoById(@PathVariable("id") Long odontologoId) throws OdontologoNotFoundException {
        LOGGER.info("fecthing Odontologo by Id from OdontoController");
        return odontologoService.fetchOdontologoById(odontologoId);
    }
    @DeleteMapping("/odontologos/{id}")
    public String deleteOdontologoById(@PathVariable("id") Long odontologoId){
        LOGGER.info("deleting Odontologo by Id from OdontoController");
        odontologoService.deleteOdontologoById(odontologoId);
        return "Odontologo suprimido correctamente";
    }
    @PutMapping("/odontologos/{id}")
    public Odontologo updateOdontologo(@PathVariable("id") Long odontologoId,
                                       @RequestBody Odontologo odontologo){
        LOGGER.info("updating Odontologo by Id from OdontoController");
        return odontologoService.updateOdontologo(odontologoId, odontologo);
    }
    @GetMapping("/odontologos/matricula/{matricula}")
    public Odontologo fectchOdontologoByMatricula(@PathVariable("matricula") String odontologoMatricula){
        return odontologoService.fectchOdontologoByMatricula(odontologoMatricula);
    }
}
