/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.muni.repository;


import com.example.muni.Entity.Persona;
import com.example.muni.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author chiri
 */
public interface UsuarioRepository extends JpaRepository<Usuario, String>{
      @Query("SELECT c FROM Usuario c WHERE c.username = :username " )
    public Usuario buscarUsername(@Param("username") String username);
    
}
