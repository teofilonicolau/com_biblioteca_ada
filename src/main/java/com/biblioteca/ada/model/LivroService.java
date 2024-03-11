package com.biblioteca.ada.model;

import java.util.List;
import java.util.Optional;

public interface LivroService {

    List<Livro> getAllLivros();

    Optional<Livro> getLivroById(Long id);

    Livro createLivro(Livro livro);

    Livro updateLivro(Long id, Livro livro);

    void deleteLivro(Long id);
}

