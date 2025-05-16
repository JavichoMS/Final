package com.Trabajo.Final.service;

import com.Trabajo.Final.model.Matricula;
import com.Trabajo.Final.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    public Matricula findByEmailAndPassword(String email, String password) {
        return matriculaRepository.findByEmailAndPassword(email, password);
    }

    public void saveLoginMatricula(Matricula matricula) {
        matriculaRepository.save(matricula);
    }
}
