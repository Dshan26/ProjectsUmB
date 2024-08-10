package com.camilo.projecto4.projecto.tienda.controller;

import com.camilo.projecto4.projecto.tienda.entities.Proveedor;
import com.camilo.projecto4.projecto.tienda.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

    @GetMapping
    public List<Proveedor> getAllProveedores() {
        return proveedorService.getAllProveedores();
    }

    @GetMapping("/{codigo}")
    public Proveedor getProveedorById(@PathVariable Long codigo) {
        return proveedorService.getProveedorById(codigo);
    }

    @PostMapping
    public Proveedor createProveedor(@RequestBody Proveedor proveedor) {
        return proveedorService.saveProveedor(proveedor);
    }

    @PutMapping("/{codigo}")
    public Proveedor updateProveedor(@PathVariable Long codigo, @RequestBody Proveedor proveedor) {
        Proveedor existingProveedor = proveedorService.getProveedorById(codigo);
        if (existingProveedor != null) {
            proveedor.setCodigo(codigo);
            return proveedorService.saveProveedor(proveedor);
        }
        return null;
    }

    @DeleteMapping("/{codigo}")
    public void deleteProveedor(@PathVariable Long codigo) {
        proveedorService.deleteProveedor(codigo);
    }
}