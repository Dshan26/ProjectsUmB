package com.camilo.project2.project2automoviles.controller;

import com.camilo.project2.project2automoviles.entities.Cliente;
import com.camilo.project2.project2automoviles.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteService.getAllClientes();
    }

    @GetMapping("/{cedulaONit}")
    public Cliente getClienteById(@PathVariable String cedulaONit) {
        return clienteService.getClienteById(cedulaONit);
    }

    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente) {
        return clienteService.saveCliente(cliente);
    }

    @PutMapping("/{cedulaONit}")
    public Cliente updateCliente(@PathVariable String cedulaONit, @RequestBody Cliente cliente) {
        Cliente existingCliente = clienteService.getClienteById(cedulaONit);
        if (existingCliente != null) {
            cliente.setCedulaONit(cedulaONit);
            return clienteService.saveCliente(cliente);
        }
        return null;
    }

    @DeleteMapping("/{cedulaONit}")
    public void deleteCliente(@PathVariable String cedulaONit) {
        clienteService.deleteCliente(cedulaONit);
    }
}