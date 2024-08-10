package com.camilo.colegio.bogota.ProjectUmb.repositories;

import com.camilo.colegio.bogota.ProjectUmb.entities.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}