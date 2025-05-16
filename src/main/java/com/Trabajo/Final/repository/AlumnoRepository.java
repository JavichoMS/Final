package com.Trabajo.Final.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Trabajo.Final.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}
