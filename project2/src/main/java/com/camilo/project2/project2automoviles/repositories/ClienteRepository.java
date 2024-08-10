package com.camilo.project2.project2automoviles.repositories;

import com.camilo.project2.project2automoviles.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {
}