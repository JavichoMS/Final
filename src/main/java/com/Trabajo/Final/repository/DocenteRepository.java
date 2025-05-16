package com.Trabajo.Final.repository;

import com.Trabajo.Final.model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Long> {
    // No es necesario agregar métodos adicionales si solo necesitas obtener todos los docentes
}
