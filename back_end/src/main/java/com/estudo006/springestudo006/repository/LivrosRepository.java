package com.estudo006.springestudo006.repository;

import com.estudo006.springestudo006.model.Livros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivrosRepository extends JpaRepository<Livros, Long> {
}
