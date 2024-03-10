package com.biblioteca.ada.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Data
@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String isbn;

    @OneToMany(mappedBy = "livro")
    private List<Emprestimo> emprestimos;


}