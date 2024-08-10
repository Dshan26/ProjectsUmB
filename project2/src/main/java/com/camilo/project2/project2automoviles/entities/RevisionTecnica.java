package com.camilo.project2.project2automoviles.entities;


import jakarta.persistence.*;

@Entity
public class RevisionTecnica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private Boolean cambioFiltro;
    private Boolean cambioAceite;
    private Boolean cambioFrenos;

    @ManyToOne
    @JoinColumn(name = "automovil_matricula")
    private Automovil automovil;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Boolean getCambioFiltro() {
        return cambioFiltro;
    }

    public void setCambioFiltro(Boolean cambioFiltro) {
        this.cambioFiltro = cambioFiltro;
    }

    public Boolean getCambioAceite() {
        return cambioAceite;
    }

    public void setCambioAceite(Boolean cambioAceite) {
        this.cambioAceite = cambioAceite;
    }

    public Boolean getCambioFrenos() {
        return cambioFrenos;
    }

    public void setCambioFrenos(Boolean cambioFrenos) {
        this.cambioFrenos = cambioFrenos;
    }

    public Automovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }
}
