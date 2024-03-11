package com.biblioteca.ada.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Membro extends BibliotecaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String endereco;
    private String fone;
    private String email;

    @OneToMany(mappedBy = "membro")
    private List<Emprestimo> emprestimos;
}



