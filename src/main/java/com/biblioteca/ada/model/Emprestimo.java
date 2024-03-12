package com.biblioteca.ada.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "membro_id")
    private Membro membro;

    private LocalDate dataEmprestimo;

    private LocalDate prazoDevolucao;

    private LocalDate dataDevolucao;

    private boolean devolvido;

    @Column(name = "multa_valor")
    private Double multaValor;

    @Column(name = "data_pagamento_multa")
    private LocalDate dataPagamentoMulta;


}

