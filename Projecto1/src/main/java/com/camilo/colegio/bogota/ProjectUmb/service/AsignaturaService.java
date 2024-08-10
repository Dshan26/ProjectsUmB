package com.camilo.colegio.bogota.ProjectUmb.service;

import com.camilo.colegio.bogota.ProjectUmb.entities.Asignatura;
import com.camilo.colegio.bogota.ProjectUmb.repositories.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsignaturaService {

  @Autowired
  private AsignaturaRepository asignaturaRepository;

  public List<Asignatura> getAllAsignaturas() {
    return asignaturaRepository.findAll();
  }

  public Optional<Asignatura> getAsignaturaById(Long id) {
    return asignaturaRepository.findById(id);
  }

  public Asignatura saveAsignatura(Asignatura asignatura) {
    return asignaturaRepository.save(asignatura);
  }

  public void deleteAsignatura(Long id) {
    asignaturaRepository.deleteById(id);
  }
}
