package com.camilo.project2.project2automoviles.services;

import com.camilo.project2.project2automoviles.entities.Cliente;
import com.camilo.project2.project2automoviles.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    public Cliente getClienteById(String cedulaONit) {
        return clienteRepository.findById(cedulaONit).orElse(null);
    }

    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deleteCliente(String cedulaONit) {
        clienteRepository.deleteById(cedulaONit);
    }
}
