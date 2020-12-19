/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.muni.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author John
 */
@Controller
@RequestMapping("/")
public class principalController {
    
    @GetMapping("/principal")
    public String principal(){
        return "paginaprincipal.html";
    }
    @GetMapping("/user")
    public String user(){
        return "user.html";
    }
    @GetMapping("/tables")
    public String tables(){
        return "tables.html";
    }
    @GetMapping("/typography")
    public String typography(){
        return "typography.html";
    }
   
    
    
    
    
    
}
