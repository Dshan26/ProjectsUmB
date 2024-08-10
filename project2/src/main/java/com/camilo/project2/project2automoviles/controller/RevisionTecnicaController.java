package com.camilo.project2.project2automoviles.controller;

import com.camilo.project2.project2automoviles.entities.RevisionTecnica;
import com.camilo.project2.project2automoviles.services.RevisionTecnicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/revisiones")
public class RevisionTecnicaController {

    @Autowired
    private RevisionTecnicaService revisionTecnicaService;

    @GetMapping
    public List<RevisionTecnica> getAllRevisiones() {
        return revisionTecnicaService.getAllRevisiones();
    }

    @GetMapping("/{id}")
    public RevisionTecnica getRevisionById(@PathVariable Long id) {
        return revisionTecnicaService.getRevisionById(id);
    }

    @PostMapping
    public RevisionTecnica createRevision(@RequestBody RevisionTecnica revision) {
        return revisionTecnicaService.saveRevision(revision);
    }

    @PutMapping("/{id}")
    public RevisionTecnica updateRevision(@PathVariable Long id, @RequestBody RevisionTecnica revision) {
        RevisionTecnica existingRevision = revisionTecnicaService.getRevisionById(id);
        if (existingRevision != null) {
            revision.setId(id);
            return revisionTecnicaService.saveRevision(revision);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteRevision(@PathVariable Long id) {
        revisionTecnicaService.deleteRevision(id);
    }
}