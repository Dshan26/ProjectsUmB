package com.camilo.project3.project3clinica.services;

import com.camilo.project3.project3clinica.entities.Medico;
import com.camilo.project3.project3clinica.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public List<Medico> getAllMedicos() {
        return medicoRepository.findAll();
    }

    public Medico getMedicoById(Long codigo) {
        return medicoRepository.findById(codigo).orElse(null);
    }

    public Medico saveMedico(Medico medico) {
        return medicoRepository.save(medico);
    }

    public void deleteMedico(Long codigo) {
        medicoRepository.deleteById(codigo);
    }
}