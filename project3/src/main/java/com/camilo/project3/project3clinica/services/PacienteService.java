package com.camilo.project3.project3clinica.services;

import com.camilo.project3.project3clinica.entities.Paciente;
import com.camilo.project3.project3clinica.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> getAllPacientes() {
        return pacienteRepository.findAll();
    }

    public Paciente getPacienteById(Long codigo) {
        return pacienteRepository.findById(codigo).orElse(null);
    }

    public Paciente savePaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    public void deletePaciente(Long codigo) {
        pacienteRepository.deleteById(codigo);
    }
}