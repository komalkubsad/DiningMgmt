/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uncg.dining.mgmt.controllers;

import edu.uncg.dining.mgmt.models.Shifts;
import edu.uncg.dining.mgmt.repositories.ShiftsRepository;
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
public class ShiftsController {
  
    @Autowired
    private ShiftsRepository shiftsRepo;
    
    @PostMapping("/shifts")
    public void save(Shifts shifts){
                System.out.println("Saving...");
                shiftsRepo.save(shifts);                        
                        
    }
    
    @GetMapping("/shifts")
    public String show (Model model){
        model.addAttribute("shifts", new Shifts());
        return "shifts";
    }
    
       @GetMapping("/shifts/{shiftsId}")
    public String show (Model model,@PathVariable long shiftId){
        Shifts shifts=shiftsRepo.findOne(shiftId);
        model.addAttribute("shifts", shifts);
        return "shifts";
    }
  
}
