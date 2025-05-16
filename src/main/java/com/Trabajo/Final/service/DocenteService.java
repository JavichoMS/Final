package com.Trabajo.Final.service;

import com.Trabajo.Final.model.Docente;
import com.Trabajo.Final.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteService {

    @Autowired
    private DocenteRepository docenteRepository;

    // Obtener todos los docentes desde la base de datos
    public List<Docente> getAllDocentes() {
        return docenteRepository.findAll();  // Devuelve todos los docentes desde la base de datos
    }

    // Guardar un docente en la base de datos
    public void saveDocente(Docente docente) {
        docenteRepository.save(docente);  // Guarda el docente en la base de datos
    }
}
