package com.biblioteca.ada.controller;

import com.biblioteca.ada.model.Livro;
import com.biblioteca.ada.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroService livroService;

    @Autowired
    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping
    public List<Livro> getAllLivros() {
        return livroService.getAllLivros();
    }

    @GetMapping("/{id}")
    public Livro getLivroById(@PathVariable Long id) {
        return livroService.getLivroById(id).orElse(null);
    }

    @PostMapping
    public Livro createLivro(@RequestBody Livro livro) {
        return livroService.createLivro(livro);
    }

    @PutMapping("/{id}")
    public Livro updateLivro(@PathVariable Long id, @RequestBody Livro livro) {
        return livroService.updateLivro(id, livro);
    }

    @DeleteMapping("/{id}")
    public void deleteLivro(@PathVariable Long id) {
        livroService.deleteLivro(id);
    }
}