package com.biblioteca.ada.service;

import com.biblioteca.ada.model.dto.EmprestimoDTO;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface EmprestimoService {

    List<EmprestimoDTO> getAllEmprestimos();

    Optional<EmprestimoDTO> getEmprestimoById(Long id);

    EmprestimoDTO createEmprestimo(EmprestimoDTO emprestimo);

    EmprestimoDTO updateEmprestimo(Long id, EmprestimoDTO emprestimo);

    void deleteEmprestimo(Long id);

    @Transactional
    EmprestimoDTO realizarDevolucao(Long id);
}