package com.biblioteca.ada.controller;


import com.biblioteca.ada.model.dto.EmprestimoDTO;
import com.biblioteca.ada.service.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {
    private final EmprestimoService emprestimoService;

    @Autowired
    public EmprestimoController(EmprestimoService emprestimoService) {
        this.emprestimoService = emprestimoService;
    }

    @GetMapping
    public List<EmprestimoDTO> getAllEmprestimos() {
        return emprestimoService.getAllEmprestimos();
    }

    @GetMapping("/{id}")
    public EmprestimoDTO getEmprestimoById(@PathVariable Long id) {
        return emprestimoService.getEmprestimoById(id).orElse(null);
    }

    @PostMapping
    public EmprestimoDTO createEmprestimo(@RequestBody EmprestimoDTO emprestimoDTO) {
        return emprestimoService.createEmprestimo(emprestimoDTO);
    }

    @PutMapping("/{id}")
    public EmprestimoDTO updateEmprestimo(@PathVariable Long id, @RequestBody EmprestimoDTO emprestimoDTO) {
        return emprestimoService.updateEmprestimo(id, emprestimoDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteEmprestimo(@PathVariable Long id) {
        emprestimoService.deleteEmprestimo(id);
    }

    @PutMapping("/{id}/devolucao")
    public EmprestimoDTO realizarDevolucao(@PathVariable Long id) {
        return emprestimoService.realizarDevolucao(id);
    }
}