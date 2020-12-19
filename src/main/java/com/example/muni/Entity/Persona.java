/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.muni.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author chiri
 */
@Entity
public class Persona {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    private Boolean habilitado;
    @OneToOne
    private ObraSocial obraSocial;
    private String numeroSocio;
    @OneToOne
    private Usuario usuario;
    
    
    //John: Refactor a la clase 


    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the habilitado
     */
    public Boolean getHabilitado() {
        return habilitado;
    }

    /**
     * @param habilitado the habilitado to set
     */
    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    /**
     * @return the obraSocial
     */
    public ObraSocial getObraSocial() {
        return obraSocial;
    }

    /**
     * @param obraSocial the obraSocial to set
     */
    public void setObraSocial(ObraSocial obraSocial) {
        this.obraSocial = obraSocial;
    }

    /**
     * @return the numeroSocio
     */
    public String getNumeroSocio() {
        return numeroSocio;
    }

    /**
     * @param numeroSocio the numeroSocio to set
     */
    public void setNumeroSocio(String numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    
    
}
