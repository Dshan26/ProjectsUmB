package com.camilo.projecto4.projecto.tienda.controller;

import com.camilo.projecto4.projecto.tienda.entities.Producto;
import com.camilo.projecto4.projecto.tienda.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> getAllProductos() {
        return productoService.getAllProductos();
    }

    @GetMapping("/{codigo}")
    public Producto getProductoById(@PathVariable Long codigo) {
        return productoService.getProductoById(codigo);
    }

    @PostMapping
    public Producto createProducto(@RequestBody Producto producto) {
        return productoService.saveProducto(producto);
    }

    @PutMapping("/{codigo}")
    public Producto updateProducto(@PathVariable Long codigo, @RequestBody Producto producto) {
        Producto existingProducto = productoService.getProductoById(codigo);
        if (existingProducto != null) {
            producto.setCodigo(codigo);
            return productoService.saveProducto(producto);
        }
        return null;
    }

    @DeleteMapping("/{codigo}")
    public void deleteProducto(@PathVariable Long codigo) {
        productoService.deleteProducto(codigo);
    }
}