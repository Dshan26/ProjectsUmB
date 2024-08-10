package com.camilo.project2.project2automoviles.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Automovil {

    @Id
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private Double precio;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToMany(mappedBy = "automovil", cascade = CascadeType.ALL)
    private List<RevisionTecnica> revisiones;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<RevisionTecnica> getRevisiones() {
        return revisiones;
    }

    public void setRevisiones(List<RevisionTecnica> revisiones) {
        this.revisiones = revisiones;
    }
}