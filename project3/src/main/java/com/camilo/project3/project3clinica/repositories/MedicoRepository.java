package com.camilo.project3.project3clinica.repositories;

import com.camilo.project3.project3clinica.entities.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {
}