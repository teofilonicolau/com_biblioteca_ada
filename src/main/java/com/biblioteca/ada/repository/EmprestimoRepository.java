package com.biblioteca.ada.repository;

import com.biblioteca.ada.model.Emprestimo;
import org.springframework.data.repository.CrudRepository;


public interface EmprestimoRepository extends CrudRepository<Emprestimo, Long> {
}