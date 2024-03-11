package com.biblioteca.ada.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Emprestimo extends BibliotecaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "livro_id")
    private Livro livro;

    @ManyToOne
    @JoinColumn(name = "membro_id")
    private Membro membro;

    private LocalDate dataEmprestimo;

    private LocalDate prazoDevolucao;

    private boolean devolvido;
}