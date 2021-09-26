package com.example.entregaFinal.service;

import com.example.entregaFinal.model.Odontologo;
import com.example.entregaFinal.repository.OdontologoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OdontologoServiceTest {

    @Autowired
    private OdontologoService odontologoService;

    @MockBean
    private OdontologoRepository odontologoRepository;

    @BeforeEach
    void setUp() {
        Odontologo odontologo =
            Odontologo.builder()
                    .odontologoApellido("Ramirez")
                    .odontologoNombre("Juan Manuel")
                    .odontologoMatricula("xlm")
                    .odontologoId(1L)
                    .build();
        Mockito.when(odontologoRepository.findByOdontologoMatriculaIgnoreCase("xlm"))
                .thenReturn(odontologo);
    }

    @Test
    @DisplayName("Retrive Odontologo based on valid matricula")
    public void ifOdontologoMatriculaExist_thenRetriveObject(){
        String odontologoMatricula = "xlm";
        Odontologo found =
                odontologoService.fectchOdontologoByMatricula(odontologoMatricula);
        assertEquals(odontologoMatricula, found.getOdontologoMatricula());
    }
}