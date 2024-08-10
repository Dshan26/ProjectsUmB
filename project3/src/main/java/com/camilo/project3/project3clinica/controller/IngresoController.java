package com.camilo.project3.project3clinica.controller;

import com.camilo.project3.project3clinica.entities.Ingreso;
import com.camilo.project3.project3clinica.services.IngresoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ingresos")
public class IngresoController {

    @Autowired
    private IngresoService ingresoService;

    @GetMapping
    public List<Ingreso> getAllIngresos() {
        return ingresoService.getAllIngresos();
    }

    @GetMapping("/{codigo}")
    public Ingreso getIngresoById(@PathVariable Long codigo) {
        return ingresoService.getIngresoById(codigo);
    }

    @PostMapping
    public Ingreso createIngreso(@RequestBody Ingreso ingreso) {
        return ingresoService.saveIngreso(ingreso);
    }

    @PutMapping("/{codigo}")
    public Ingreso updateIngreso(@PathVariable Long codigo, @RequestBody Ingreso ingreso) {
        Ingreso existingIngreso = ingresoService.getIngresoById(codigo);
        if (existingIngreso != null) {
            ingreso.setCodigo(codigo);
            return ingresoService.saveIngreso(ingreso);
        }
        return null;
    }

    @DeleteMapping("/{codigo}")
    public void deleteIngreso(@PathVariable Long codigo) {
        ingresoService.deleteIngreso(codigo);
    }
}