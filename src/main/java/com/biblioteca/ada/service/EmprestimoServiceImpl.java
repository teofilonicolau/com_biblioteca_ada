package com.biblioteca.ada.service;

import com.biblioteca.ada.model.dto.EmprestimoDTO;
import com.biblioteca.ada.model.Emprestimo;
import com.biblioteca.ada.model.Livro;
import com.biblioteca.ada.repository.LivroRepository;
import com.biblioteca.ada.repository.EmprestimoRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class EmprestimoServiceImpl implements EmprestimoService {

    private final EmprestimoRepository emprestimoRepository;
    private final LivroRepository livroRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public EmprestimoServiceImpl(EmprestimoRepository emprestimoRepository, LivroRepository livroRepository, ModelMapper modelMapper) {
        this.emprestimoRepository = emprestimoRepository;
        this.livroRepository = livroRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<EmprestimoDTO> getAllEmprestimos() {
        Iterable<Emprestimo> emprestimosIterable = emprestimoRepository.findAll();
        List<Emprestimo> emprestimos = StreamSupport.stream(emprestimosIterable.spliterator(), false)
                .collect(Collectors.toList());
        return emprestimos.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<EmprestimoDTO> getEmprestimoById(Long id) {
        Optional<Emprestimo> emprestimoOptional = emprestimoRepository.findById(id);
        return emprestimoOptional.map(this::convertToDTO);
    }

    @Override
    public EmprestimoDTO createEmprestimo(EmprestimoDTO emprestimoDTO) {
        Emprestimo emprestimo = convertToEntity(emprestimoDTO);
        Emprestimo savedEmprestimo = emprestimoRepository.save(emprestimo);
        return convertToDTO(savedEmprestimo);
    }

    @Override
    public EmprestimoDTO updateEmprestimo(Long id, EmprestimoDTO emprestimoDTO) {
        if (emprestimoRepository.existsById(id)) {
            emprestimoDTO.setId(id);
            Emprestimo updatedEmprestimo = emprestimoRepository.save(convertToEntity(emprestimoDTO));
            return convertToDTO(updatedEmprestimo);
        }
        return null;
    }

    @Override
    public void deleteEmprestimo(Long id) {
        emprestimoRepository.deleteById(id);
    }

    @Override
    @Transactional
    public EmprestimoDTO realizarDevolucao(Long id) {
        Optional<Emprestimo> emprestimoOptional = emprestimoRepository.findById(id);

        if (emprestimoOptional.isPresent()) {
            Emprestimo emprestimo = emprestimoOptional.get();

            if (!emprestimo.isDevolvido()) {
                Livro livro = emprestimo.getLivro();

                if (!livro.isDisponivel()) {
                    return null;
                }

                emprestimo.setDevolvido(true);
                emprestimo.setDataDevolucao(LocalDate.now());
                livro.setDisponivel(true);

                emprestimoRepository.save(emprestimo);
                livroRepository.save(livro);

                return convertToDTO(emprestimo);
            }
        }

        return null;
    }

    private EmprestimoDTO convertToDTO(Emprestimo emprestimo) {
        return modelMapper.map(emprestimo, EmprestimoDTO.class);
    }

    private Emprestimo convertToEntity(EmprestimoDTO emprestimoDTO) {
        return modelMapper.map(emprestimoDTO, Emprestimo.class);
    }
}