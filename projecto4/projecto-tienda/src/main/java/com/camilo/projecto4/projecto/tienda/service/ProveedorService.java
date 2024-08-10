package com.camilo.projecto4.projecto.tienda.service;

import com.camilo.projecto4.projecto.tienda.entities.Proveedor;
import com.camilo.projecto4.projecto.tienda.repositories.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;

    public List<Proveedor> getAllProveedores() {
        return proveedorRepository.findAll();
    }

    public Proveedor getProveedorById(Long codigo) {
        return proveedorRepository.findById(codigo).orElse(null);
    }

    public Proveedor saveProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    public void deleteProveedor(Long codigo) {
        proveedorRepository.deleteById(codigo);
    }
}
