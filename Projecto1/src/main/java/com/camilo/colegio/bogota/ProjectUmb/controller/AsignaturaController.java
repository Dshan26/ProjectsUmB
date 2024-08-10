package com.camilo.colegio.bogota.ProjectUmb.controller;

import com.camilo.colegio.bogota.ProjectUmb.entities.Asignatura;
import com.camilo.colegio.bogota.ProjectUmb.service.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/asignaturas")
public class AsignaturaController {

    @Autowired
    private AsignaturaService asignaturaService;

    @GetMapping
    public List<Asignatura> getAllAsignaturas() {
        return asignaturaService.getAllAsignaturas();
    }

    @GetMapping("/{id}")
    public Optional<Asignatura> getAsignaturaById(@PathVariable Long id) {
        return asignaturaService.getAsignaturaById(id);
    }

    @PostMapping
    public Asignatura createAsignatura(@RequestBody Asignatura asignatura) {
        return asignaturaService.saveAsignatura(asignatura);
    }

    @PutMapping("/{id}")
    public Asignatura updateAsignatura(@PathVariable Long id, @RequestBody Asignatura asignatura) {
        Optional<Asignatura> existingAsignatura = asignaturaService.getAsignaturaById(id);
        if (existingAsignatura.isPresent()) {
            asignatura.setId(id);
            return asignaturaService.saveAsignatura(asignatura);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteAsignatura(@PathVariable Long id) {
        asignaturaService.deleteAsignatura(id);
    }
}
