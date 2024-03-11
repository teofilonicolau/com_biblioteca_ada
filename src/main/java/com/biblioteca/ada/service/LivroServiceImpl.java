package com.biblioteca.ada.service;

import com.biblioteca.ada.model.Livro;
import com.biblioteca.ada.model.LivroService;
import com.biblioteca.ada.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroServiceImpl implements LivroService {

    private final LivroRepository livroRepository;

    @Autowired
    public LivroServiceImpl(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    @Override
    public List<Livro> getAllLivros() {
        return (List<Livro>) livroRepository.findAll();
    }

    @Override
    public Optional<Livro> getLivroById(Long id) {
        return livroRepository.findById(id);
    }

    @Override
    public Livro createLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    @Override
    public Livro updateLivro(Long id, Livro livro) {
        if (livroRepository.existsById(id)) {
            livro.setId(id);
            return livroRepository.save(livro);
        }
        return null;
    }

    @Override
    public void deleteLivro(Long id) {
        livroRepository.deleteById(id);
    }
}
