package com.petshop.service;

import org.springframework.stereotype.Service;

import com.petshop.entity.Usuario;
import com.petshop.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Optional<Usuario> buscarPorCpf(String cpf) {
        return usuarioRepository.findByCpf(cpf);
    }

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}