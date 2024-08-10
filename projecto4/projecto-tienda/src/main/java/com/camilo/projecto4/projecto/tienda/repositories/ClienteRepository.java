package com.camilo.projecto4.projecto.tienda.repositories;

import com.camilo.projecto4.projecto.tienda.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
