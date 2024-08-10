package com.camilo.project3.project3clinica.services;

import com.camilo.project3.project3clinica.entities.Ingreso;
import com.camilo.project3.project3clinica.repositories.IngresoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngresoService {

    @Autowired
    private IngresoRepository ingresoRepository;

    public List<Ingreso> getAllIngresos() {
        return ingresoRepository.findAll();
    }

    public Ingreso getIngresoById(Long codigo) {
        return ingresoRepository.findById(codigo).orElse(null);
    }

    public Ingreso saveIngreso(Ingreso ingreso) {
        return ingresoRepository.save(ingreso);
    }

    public void deleteIngreso(Long codigo) {
        ingresoRepository.deleteById(codigo);
    }
}