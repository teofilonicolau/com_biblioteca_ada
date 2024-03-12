package com.biblioteca.ada.repository;

import com.biblioteca.ada.model.Membro;
import org.springframework.data.repository.CrudRepository;

public interface MembroRepository extends CrudRepository<Membro, Long> {
}
