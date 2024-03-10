package com.biblioteca.ada.repository;

import com.biblioteca.ada.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}