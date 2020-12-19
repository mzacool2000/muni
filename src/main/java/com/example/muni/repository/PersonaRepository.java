/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.muni.repository;

import com.example.muni.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author chiri
 */       
@Repository
public interface PersonaRepository extends JpaRepository<Persona, String>{
    @Query("SELECT c FROM Persona c WHERE c.email = :email " )
    public Persona buscarEmail(@Param("email") String email);
}
