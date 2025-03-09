package com.petshop.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petshop.entity.Pets;

@Repository
public interface PetsRepository extends JpaRepository<Pets, Long> {
    List<Pets> findByClienteId(Long clienteId);
}