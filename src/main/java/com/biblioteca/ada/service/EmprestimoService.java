package com.biblioteca.ada.service;

import com.biblioteca.ada.model.Emprestimo;
import com.biblioteca.ada.repository.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmprestimoService {

    private final EmprestimoRepository emprestimoRepository;

    @Autowired
    public EmprestimoService(EmprestimoRepository emprestimoRepository) {
        this.emprestimoRepository = emprestimoRepository;
    }

    public List<Emprestimo> getAllEmprestimos() {
        return emprestimoRepository.findAll();
    }

    public Optional<Emprestimo> getEmprestimoById(Long id) {
        return emprestimoRepository.findById(id);
    }

    public Emprestimo createEmprestimo(Emprestimo emprestimo) {
        return emprestimoRepository.save(emprestimo);
    }

    public Emprestimo updateEmprestimo(Long id, Emprestimo emprestimo) {
        if (emprestimoRepository.existsById(id)) {
            emprestimo.setId(id);
            return emprestimoRepository.save(emprestimo);
        }
        return null;
    }

    public void deleteEmprestimo(Long id) {
        emprestimoRepository.deleteById(id);
    }
}