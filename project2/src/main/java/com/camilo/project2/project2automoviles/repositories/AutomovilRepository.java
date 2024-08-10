package com.camilo.project2.project2automoviles.repositories;

import com.camilo.project2.project2automoviles.entities.Automovil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomovilRepository extends JpaRepository<Automovil, String> {
}