package com.camilo.project2.project2automoviles.controller;


import com.camilo.project2.project2automoviles.entities.Automovil;
import com.camilo.project2.project2automoviles.services.AutomovilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/automoviles")
public class AutomovilController {

    @Autowired
    private AutomovilService automovilService;

    @GetMapping
    public List<Automovil> getAllAutomoviles() {
        return automovilService.getAllAutomoviles();
    }

    @GetMapping("/{matricula}")
    public Automovil getAutomovilByMatricula(@PathVariable String matricula) {
        return automovilService.getAutomovilByMatricula(matricula);
    }

    @PostMapping
    public Automovil createAutomovil(@RequestBody Automovil automovil) {
        return automovilService.saveAutomovil(automovil);
    }

    @PutMapping("/{matricula}")
    public Automovil updateAutomovil(@PathVariable String matricula, @RequestBody Automovil automovil) {
        Automovil existingAutomovil = automovilService.getAutomovilByMatricula(matricula);
        if (existingAutomovil != null) {
            automovil.setMatricula(matricula);
            return automovilService.saveAutomovil(automovil);
        }
        return null;
    }

    @DeleteMapping("/{matricula}")
    public void deleteAutomovil(@PathVariable String matricula) {
        automovilService.deleteAutomovil(matricula);
    }
}