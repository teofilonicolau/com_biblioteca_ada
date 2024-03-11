package com.biblioteca.ada.repository;

import com.biblioteca.ada.model.Livro;
import org.springframework.data.repository.CrudRepository;


public interface LivroRepository extends CrudRepository<Livro, Long> {
}

