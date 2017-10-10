/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uncg.dining.mgmt.controllers;

import edu.uncg.dining.mgmt.models.Managerlogin;
import edu.uncg.dining.mgmt.repositories.ManagerloginRepository;
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
public class ManagerloginController {
   
    @Autowired
    private ManagerloginRepository managerloginRepo;
    
    @PostMapping("/managerlogin")
    public void save(Managerlogin managerlogin){
                System.out.println("Saving...");
                managerloginRepo.save(managerlogin);                        
                        
    }
    
    @GetMapping("/managerlogin")
    public String show (Model model){
        model.addAttribute("managerlogin", new Managerlogin());
        return "managerlogin";
    }
    
       @GetMapping("/managerlogin/{managerId}")
    public String show (Model model,@PathVariable long managerId){
        Managerlogin managerlogin=managerloginRepo.findOne(managerId);
        model.addAttribute("managerlogin", managerlogin);
        return "managerlogin";
    }
}
