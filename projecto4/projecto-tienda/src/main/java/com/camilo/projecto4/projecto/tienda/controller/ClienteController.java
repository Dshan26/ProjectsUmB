package com.camilo.projecto4.projecto.tienda.controller;

import com.camilo.projecto4.projecto.tienda.entities.Cliente;
import com.camilo.projecto4.projecto.tienda.service.ClienteService;
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

    @GetMapping("/{codigo}")
    public Cliente getClienteById(@PathVariable Long codigo) {
        return clienteService.getClienteById(codigo);
    }

    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente) {
        return clienteService.saveCliente(cliente);
    }

    @PutMapping("/{codigo}")
    public Cliente updateCliente(@PathVariable Long codigo, @RequestBody Cliente cliente) {
        Cliente existingCliente = clienteService.getClienteById(codigo);
        if (existingCliente != null) {
            cliente.setCodigo(codigo);
            return clienteService.saveCliente(cliente);
        }
        return null;
    }

    @DeleteMapping("/{codigo}")
    public void deleteCliente(@PathVariable Long codigo) {
        clienteService.deleteCliente(codigo);
    }
}