package com.petshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petshop.entity.Pets;
import com.petshop.service.PetService;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping
    public List<Pets> listarTodos() {
        return petService.listarTodos();
    }

    @GetMapping("/cliente/{clienteId}")
    public List<Pets> buscarPorCliente(@PathVariable Long clienteId) {
        return petService.buscarPorClienteId(clienteId);
    }

    @PostMapping
    public Pets salvar(@RequestBody Pets pet) {
        return petService.salvar(pet);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        petService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
