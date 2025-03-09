package com.petshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petshop.entity.Raca;
import com.petshop.repository.RacaRepository;

@Service
public class RacaService {

	@Autowired
    private RacaRepository racaRepository;

    public List<Raca> listarTodos() {
        return racaRepository.findAll();
    }

    public Raca salvar(Raca raca) {
        return racaRepository.save(raca);
    }

    public void deletar(Long id) {
        racaRepository.deleteById(id);
    }
	
}
