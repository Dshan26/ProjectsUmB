package com.camilo.projecto4.projecto.tienda.service;

import com.camilo.projecto4.projecto.tienda.entities.Cliente;
import com.camilo.projecto4.projecto.tienda.repositories.ClienteRepository;
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

    public Cliente getClienteById(Long codigo) {
        return clienteRepository.findById(codigo).orElse(null);
    }

    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deleteCliente(Long codigo) {
        clienteRepository.deleteById(codigo);
    }
}