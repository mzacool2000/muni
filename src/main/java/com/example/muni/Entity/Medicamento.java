/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.muni.Entity;

import java.util.Calendar;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author chiri
 */
@Entity
public class Medicamento {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    
    //John: Arregle esto
    @OneToOne  
    private Laboratorio laboratorio;
    
    private Integer numeroCertificado;
    private String nombreComercial;
    private String nombreGenerico;
    private String concentracion;
    
    @OneToOne
    private Presentacion presentacion;
    private boolean fraccionado;

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
     * @return the laboratorio
     */
    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    /**
     * @param laboratorio the laboratorio to set
     */
    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    /**
     * @return the numeroCertificado
     */
    public Integer getNumeroCertificado() {
        return numeroCertificado;
    }

    /**
     * @param numeroCertificado the numeroCertificado to set
     */
    public void setNumeroCertificado(Integer numeroCertificado) {
        this.numeroCertificado = numeroCertificado;
    }

    /**
     * @return the nombreComercial
     */
    public String getNombreComercial() {
        return nombreComercial;
    }

    /**
     * @param nombreComercial the nombreComercial to set
     */
    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    /**
     * @return the nombreGenerico
     */
    public String getNombreGenerico() {
        return nombreGenerico;
    }

    /**
     * @param nombreGenerico the nombreGenerico to set
     */
    public void setNombreGenerico(String nombreGenerico) {
        this.nombreGenerico = nombreGenerico;
    }

    /**
     * @return the concentracion
     */
    public String getConcentracion() {
        return concentracion;
    }

    /**
     * @param concentracion the concentracion to set
     */
    public void setConcentracion(String concentracion) {
        this.concentracion = concentracion;
    }

    /**
     * @return the presentacion
     */
    public Presentacion getPresentacion() {
        return presentacion;
    }

    /**
     * @param presentacion the presentacion to set
     */
    public void setPresentacion(Presentacion presentacion) {
        this.presentacion = presentacion;
    }

    /**
     * @return the fraccionado
     */
    public boolean isFraccionado() {
        return fraccionado;
    }

    /**
     * @param fraccionado the fraccionado to set
     */
    public void setFraccionado(boolean fraccionado) {
        this.fraccionado = fraccionado;
    }
    
    
    
    
}
