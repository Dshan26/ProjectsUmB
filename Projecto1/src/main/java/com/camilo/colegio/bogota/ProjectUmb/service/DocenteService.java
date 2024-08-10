package com.camilo.colegio.bogota.ProjectUmb.service;

import com.camilo.colegio.bogota.ProjectUmb.entities.Docente;
import com.camilo.colegio.bogota.ProjectUmb.repositories.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteService {

    @Autowired
    private DocenteRepository docenteRepository;

    public List<Docente> getAllDocentes() {
        return docenteRepository.findAll();
    }

    public Docente getDocenteById(Long id) {
        return docenteRepository.findById(id).orElse(null);
    }

    public Docente saveDocente(Docente docente) {
        return docenteRepository.save(docente);
    }

    public void deleteDocente(Long id) {
        docenteRepository.deleteById(id);
    }
}
