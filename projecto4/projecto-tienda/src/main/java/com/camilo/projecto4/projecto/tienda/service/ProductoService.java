package com.camilo.projecto4.projecto.tienda.service;

import com.camilo.projecto4.projecto.tienda.entities.Producto;
import com.camilo.projecto4.projecto.tienda.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    public Producto getProductoById(Long codigo) {
        return productoRepository.findById(codigo).orElse(null);
    }

    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public void deleteProducto(Long codigo) {
        productoRepository.deleteById(codigo);
    }
}