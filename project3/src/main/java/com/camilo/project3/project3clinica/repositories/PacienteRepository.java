package com.camilo.project3.project3clinica.repositories;

import com.camilo.project3.project3clinica.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}