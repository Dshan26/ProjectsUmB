package com.camilo.project2.project2automoviles.services;

import com.camilo.project2.project2automoviles.entities.Automovil;
import com.camilo.project2.project2automoviles.repositories.AutomovilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutomovilService {

    @Autowired
    private AutomovilRepository automovilRepository;

    public List<Automovil> getAllAutomoviles() {
        return automovilRepository.findAll();
    }

    public Automovil getAutomovilByMatricula(String matricula) {
        return automovilRepository.findById(matricula).orElse(null);
    }

    public Automovil saveAutomovil(Automovil automovil) {
        return automovilRepository.save(automovil);
    }

    public void deleteAutomovil(String matricula) {
        automovilRepository.deleteById(matricula);
    }
}