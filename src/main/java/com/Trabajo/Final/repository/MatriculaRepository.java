package com.Trabajo.Final.repository;

import com.Trabajo.Final.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
    // Método para encontrar una matrícula por correo y contraseña
    Matricula findByEmailAndPassword(String email, String password);
}
