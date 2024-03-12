package com.biblioteca.ada.service;

import com.biblioteca.ada.model.Membro;
import com.biblioteca.ada.repository.MembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class MembroService {

    private final MembroRepository membroRepository;

    @Autowired
    public MembroService(MembroRepository membroRepository) {
        this.membroRepository = membroRepository;
    }

    public List<Membro> getAllMembros() {
        Iterable<Membro> membrosIterable = membroRepository.findAll();
        List<Membro> membros = StreamSupport.stream(membrosIterable.spliterator(), false)
                .collect(Collectors.toList());
        return membros;
    }

    public Optional<Membro> getMembroById(Long id) {
        return membroRepository.findById(id);
    }

    public Membro createMembro(Membro membro) {
        return membroRepository.save(membro);
    }

    public Membro updateMembro(Long id, Membro membro) {
        if (membroRepository.existsById(id)) {
            membro.setId(id);
            return membroRepository.save(membro);
        }
        return null;
    }

    public void deleteMembro(Long id) {
        membroRepository.deleteById(id);
    }
}
