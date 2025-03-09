package com.petshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.petshop.repository.EnderecoRepository;
import com.petshop.entity.Endereco;

public class EnderecoService {
	@Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> listarTodos() {
        return enderecoRepository.findAll();
    }

    public List<Endereco> buscarPorClienteId(Long clienteId) {
        return enderecoRepository.findByClienteId(clienteId);
    }

    public Endereco salvar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public void deletar(Long id) {
        enderecoRepository.deleteById(id);
    }
}
