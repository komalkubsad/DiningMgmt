/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uncg.dining.mgmt.controllers;

import edu.uncg.dining.mgmt.models.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import edu.uncg.dining.mgmt.repositories.LoginRepository;

/**
 *
 * @author shrav
 */
 @Controller
public class LoginController {
   
    @Autowired
    private LoginRepository loginRepo;
    
    @PostMapping("/login")
    public void save(Login login){
                System.out.println("Saving...");
                loginRepo.save(login);                        
                        
    }
    
    @GetMapping("/login")
    public String show (Model model){
        model.addAttribute("login", new Login());
        return "login";
    }
    
       @GetMapping("/login/{id}")
    public String show (Model model,@PathVariable long id){
        Login login=loginRepo.findOne(id);
        model.addAttribute("login", login);
        return "login";
    }
}
