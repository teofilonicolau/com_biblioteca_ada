package com.biblioteca.ada.repository;

import com.biblioteca.ada.model.Membro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembroRepository extends JpaRepository<Membro, Long> {
}
