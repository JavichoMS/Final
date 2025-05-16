package com.Trabajo.Final.repository;

import com.Trabajo.Final.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    // Método para buscar por email y contraseña
    User findByEmailAndPassword(String email, String password);

}
