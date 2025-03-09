package com.petshop.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petshop.entity.Pets;
import com.petshop.repository.PetsRepository;

@Service
public class PetService {

    @Autowired
    private PetsRepository petsRepository;

    public List<Pets> listarTodos() {
        return petsRepository.findAll();
    }

    public List<Pets> buscarPorClienteId(Long clienteId) {
        return petsRepository.findByClienteId(clienteId);
    }

    public Pets salvar(Pets pet) {
        return petsRepository.save(pet);
    }

    public void deletar(Long id) {
        petsRepository.deleteById(id);
    }
}

