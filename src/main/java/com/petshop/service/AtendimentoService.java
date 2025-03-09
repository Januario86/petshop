package com.petshop.service;
import org.springframework.stereotype.Service;

import com.petshop.entity.Atendimento;
import com.petshop.repository.AtendimentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class AtendimentoService {

    @Autowired
    private AtendimentoRepository atendimentoRepository;

    public List<Atendimento> listarTodos() {
        return atendimentoRepository.findAll();
    }

    public List<Atendimento> buscarPorPetId(Long petId) {
        return atendimentoRepository.findByPetId(petId);
    }

    public Atendimento salvar(Atendimento atendimento) {
        return atendimentoRepository.save(atendimento);
    }

    public void deletar(Long id) {
        atendimentoRepository.deleteById(id);
    }
}