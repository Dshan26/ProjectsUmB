package com.camilo.colegio.bogota.ProjectUmb.controller;

import com.camilo.colegio.bogota.ProjectUmb.entities.Asignatura;
import com.camilo.colegio.bogota.ProjectUmb.entities.Docente;
import com.camilo.colegio.bogota.ProjectUmb.service.AsignaturaService;
import com.camilo.colegio.bogota.ProjectUmb.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/docentes")
public class DocenteController {

  @Autowired
  private DocenteService docenteService;

  @Autowired
  private AsignaturaService asignaturaService;

  @GetMapping
  public List<Docente> getAllDocentes() {
    return docenteService.getAllDocentes();
  }

  @GetMapping("/{id}")
  public Docente getDocenteById(@PathVariable Long id) {
    return docenteService.getDocenteById(id);
  }

  @PostMapping
  public Docente createDocente(@RequestBody Docente docente) {
    asignarMaterias(docente);
    return docenteService.saveDocente(docente);
  }

  @PutMapping("/{id}")
  public Docente updateDocente(@PathVariable Long id, @RequestBody Docente docente) {
    Docente existingDocente = docenteService.getDocenteById(id);
    if (existingDocente != null) {
      asignarMaterias(docente);
      docente.setId(id);
      return docenteService.saveDocente(docente);
    }
    return null;
  }

  @DeleteMapping("/{id}")
  public void deleteDocente(@PathVariable Long id) {
    docenteService.deleteDocente(id);
  }

  private void asignarMaterias(@RequestBody Docente docente) {
    List<Asignatura> asignaturas = new ArrayList<>();
    for (Asignatura a : docente.getAsignaturas()) {
      Optional<Asignatura> asignatura = asignaturaService.getAsignaturaById(a.getId());
      asignatura.ifPresent(asignaturas::add);
    }
    docente.setAsignaturas(asignaturas);
  }

}
