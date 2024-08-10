package com.camilo.colegio.bogota.ProjectUmb.repositories;

import com.camilo.colegio.bogota.ProjectUmb.entities.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Long> {
}
