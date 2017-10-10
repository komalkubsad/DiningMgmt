/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uncg.dining.mgmt.controllers;

import edu.uncg.dining.mgmt.models.Supervisorlogin;
import edu.uncg.dining.mgmt.repositories.SupervisorloginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author shrav
 */
 @Controller
public class SupervisorloginController {
  
    @Autowired
    private SupervisorloginRepository supervisorloginRepo;
    
    @PostMapping("/supervisorlogin")
    public void save(Supervisorlogin supervisorlogin){
                System.out.println("Saving...");
                supervisorloginRepo.save(supervisorlogin);                        
                        
    }
    
    @GetMapping("/supervisorlogin")
    public String show (Model model){
        model.addAttribute("supervisorlogin", new Supervisorlogin());
        return "supervisorlogin";
    }
    
       @GetMapping("/supervisorlogin/{supervisorId}")
    public String show (Model model,@PathVariable long supervisorId){
        Supervisorlogin supervisorlogin=supervisorloginRepo.findOne(supervisorId);
        model.addAttribute("supervisorlogin", supervisorlogin);
        return "supervisorlogin";
    }
}
