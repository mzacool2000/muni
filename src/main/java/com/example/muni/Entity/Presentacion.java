/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.muni.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author chiri
 */
@Entity
class Presentacion {
        @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String nombre;
    private Integer unidadesPorPresentacion;

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
     * @return the unidadesPorPresentacion
     */
    public Integer getUnidadesPorPresentacion() {
        return unidadesPorPresentacion;
    }

    /**
     * @param unidadesPorPresentacion the unidadesPorPresentacion to set
     */
    public void setUnidadesPorPresentacion(Integer unidadesPorPresentacion) {
        this.unidadesPorPresentacion = unidadesPorPresentacion;
    }
    
        
    
}
