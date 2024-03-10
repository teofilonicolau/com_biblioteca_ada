package com.biblioteca.ada.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Membro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String endereco;
    private String contato;

    @OneToMany(mappedBy = "membro")
    private List<Emprestimo> emprestimos;
}


}