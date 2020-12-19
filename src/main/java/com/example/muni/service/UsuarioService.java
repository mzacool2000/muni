/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.muni.service;

import com.example.muni.Entity.Persona;
import com.example.muni.Entity.Usuario;
import com.example.muni.repository.UsuarioRepository;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 *
 * @author chiri
 */
@Service
public class UsuarioService implements UserDetailsService {

//John: Arreglo orden de sintaxis    
@Autowired 
private UsuarioRepository usuarioRepository;    

@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.buscarUsername(username);
        if (usuario != null) {

            List<GrantedAuthority> permisos = new ArrayList<>();
                GrantedAuthority p1 = new SimpleGrantedAuthority("MODULO_MUNI");
                permisos.add(p1);
            

            GrantedAuthority p2 = new SimpleGrantedAuthority("MODULO_MUNI");
            permisos.add(p2);
            
            ServletRequestAttributes attr =(ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            HttpSession session = attr.getRequest().getSession(true);
            session.setAttribute("usuario", usuario);
            User user = new User(usuario.getUsername(), usuario.getPassword(), permisos);
            return user;

        } else {
            return null;
        }
    }
    
}
