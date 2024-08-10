package com.camilo.project2.project2automoviles.services;

import com.camilo.project2.project2automoviles.entities.RevisionTecnica;
import com.camilo.project2.project2automoviles.repositories.RevisionTecnicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RevisionTecnicaService {

    @Autowired
    private RevisionTecnicaRepository revisionTecnicaRepository;

    public List<RevisionTecnica> getAllRevisiones() {
        return revisionTecnicaRepository.findAll();
    }

    public RevisionTecnica getRevisionById(Long id) {
        return revisionTecnicaRepository.findById(id).orElse(null);
    }

    public RevisionTecnica saveRevision(RevisionTecnica revision) {
        return revisionTecnicaRepository.save(revision);
    }

    public void deleteRevision(Long id) {
        revisionTecnicaRepository.deleteById(id);
    }
}