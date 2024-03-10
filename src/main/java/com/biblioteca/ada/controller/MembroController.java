package com.biblioteca.ada.controller;

import com.biblioteca.ada.model.Membro;
import com.biblioteca.ada.service.MembroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/membros")
public class MembroController {

    private final MembroService membroService;

    @Autowired
    public MembroController(MembroService membroService) {
        this.membroService = membroService;
    }

    @GetMapping
    public List<Membro> getAllMembros() {
        return membroService.getAllMembros();
    }

    @GetMapping("/{id}")
    public Membro getMembroById(@PathVariable Long id) {
        return membroService.getMembroById(id).orElse(null);
    }

    @PostMapping
    public Membro createMembro(@RequestBody Membro membro) {
        return membroService.createMembro(membro);
    }

    @PutMapping("/{id}")
    public Membro updateMembro(@PathVariable Long id, @RequestBody Membro membro) {
        return membroService.updateMembro(id, membro);
    }

    @DeleteMapping("/{id}")
    public void deleteMembro(@PathVariable Long id) {
        membroService.deleteMembro(id);
    }
}