/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uncg.dining.mgmt.controllers;

import edu.uncg.dining.mgmt.models.Customize;
import edu.uncg.dining.mgmt.repositories.CustomizeRepository;
import java.util.List;
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
public class CustomizeController {
    
    @Autowired
    private CustomizeRepository customizeRepo;
    
    @PostMapping("/customize")
    public String save(Customize customize){
                System.out.println("Saving...");
                customizeRepo.save(customize);                        
                 return "redirect:/customized";        
    }
    
    @GetMapping("/customize")
    public String show (Model model){
        model.addAttribute("customize", new Customize());
        return "customize";
    }
    
       @GetMapping("/customize/{customizeId}")
    public String show (Model model,@PathVariable long customizeId){
        Customize customize=customizeRepo.findOne(customizeId);
        model.addAttribute("customize", customize);
        return "customize";
    }
    
    @GetMapping("/customized")
    public String showAllCustomized (Model model){ 
        final List<Customize> allCustomized = customizeRepo.findAll();
        model.addAttribute("customized",allCustomized);
        return "student_home";
    }
}
