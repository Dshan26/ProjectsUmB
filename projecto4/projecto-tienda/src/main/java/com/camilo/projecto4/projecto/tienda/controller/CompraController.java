package com.camilo.projecto4.projecto.tienda.controller;

import com.camilo.projecto4.projecto.tienda.entities.Compra;
import com.camilo.projecto4.projecto.tienda.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compras")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @GetMapping
    public List<Compra> getAllCompras() {
        return compraService.getAllCompras();
    }

    @GetMapping("/{id}")
    public Compra getCompraById(@PathVariable Long id) {
        return compraService.getCompraById(id);
    }

    @PostMapping
    public Compra createCompra(@RequestBody Compra compra) {
        return compraService.saveCompra(compra);
    }

    @PutMapping("/{id}")
    public Compra updateCompra(@PathVariable Long id, @RequestBody Compra compra) {
        Compra existingCompra = compraService.getCompraById(id);
        if (existingCompra != null) {
            compra.setId(id);
            return compraService.saveCompra(compra);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteCompra(@PathVariable Long id) {
        compraService.deleteCompra(id);
    }
}