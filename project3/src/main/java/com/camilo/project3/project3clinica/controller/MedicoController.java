package com.camilo.project3.project3clinica.controller;

import com.camilo.project3.project3clinica.entities.Medico;
import com.camilo.project3.project3clinica.services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicos")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @GetMapping
    public List<Medico> getAllMedicos() {
        return medicoService.getAllMedicos();
    }

    @GetMapping("/{codigo}")
    public Medico getMedicoById(@PathVariable Long codigo) {
        return medicoService.getMedicoById(codigo);
    }

    @PostMapping
    public Medico createMedico(@RequestBody Medico medico) {
        return medicoService.saveMedico(medico);
    }

    @PutMapping("/{codigo}")
    public Medico updateMedico(@PathVariable Long codigo, @RequestBody Medico medico) {
        Medico existingMedico = medicoService.getMedicoById(codigo);
        if (existingMedico != null) {
            medico.setCodigo(codigo);
            return medicoService.saveMedico(medico);
        }
        return null;
    }

    @DeleteMapping("/{codigo}")
    public void deleteMedico(@PathVariable Long codigo) {
        medicoService.deleteMedico(codigo);
    }
}