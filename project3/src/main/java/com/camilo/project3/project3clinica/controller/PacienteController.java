package com.camilo.project3.project3clinica.controller;

import com.camilo.project3.project3clinica.entities.Paciente;
import com.camilo.project3.project3clinica.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public List<Paciente> getAllPacientes() {
        return pacienteService.getAllPacientes();
    }

    @GetMapping("/{codigo}")
    public Paciente getPacienteById(@PathVariable Long codigo) {
        return pacienteService.getPacienteById(codigo);
    }

    @PostMapping
    public Paciente createPaciente(@RequestBody Paciente paciente) {
        return pacienteService.savePaciente(paciente);
    }

    @PutMapping("/{codigo}")
    public Paciente updatePaciente(@PathVariable Long codigo, @RequestBody Paciente paciente) {
        Paciente existingPaciente = pacienteService.getPacienteById(codigo);
        if (existingPaciente != null) {
            paciente.setCodigo(codigo);
            return pacienteService.savePaciente(paciente);
        }
        return null;
    }

    @DeleteMapping("/{codigo}")
    public void deletePaciente(@PathVariable Long codigo) {
        pacienteService.deletePaciente(codigo);
    }
}