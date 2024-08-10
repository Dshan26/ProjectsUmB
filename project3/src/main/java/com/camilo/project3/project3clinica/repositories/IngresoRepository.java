package com.camilo.project3.project3clinica.repositories;

import com.camilo.project3.project3clinica.entities.Ingreso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngresoRepository extends JpaRepository<Ingreso, Long> {
}