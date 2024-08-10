package com.camilo.colegio.bogota.ProjectUmb.repositories;

import com.camilo.colegio.bogota.ProjectUmb.entities.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignaturaRepository extends JpaRepository<Asignatura, Long> {
}
