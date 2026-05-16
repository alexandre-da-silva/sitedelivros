package com.estudo006.springestudo006.repository;

import com.estudo006.springestudo006.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}