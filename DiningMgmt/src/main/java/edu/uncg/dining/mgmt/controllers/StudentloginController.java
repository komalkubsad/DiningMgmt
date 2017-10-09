/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uncg.dining.mgmt.controllers;

import edu.uncg.dining.mgmt.models.Student;
import edu.uncg.dining.mgmt.models.Studentlogin;
import edu.uncg.dining.mgmt.repositories.StudentRepository;
import edu.uncg.dining.mgmt.repositories.StudentloginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author komalkubsad
 */
@Controller
public class StudentloginController {
    @Autowired
    private StudentloginRepository studentloginRepo;
    
    @PostMapping("/studentlogin")
    public void save(Studentlogin studentlogin){
                System.out.println("Saving...");
                studentloginRepo.save(studentlogin);
                        
                        
                        
    }
    
    @GetMapping("/studentlogin")
    public String show (Model model){
        model.addAttribute("studentlogin", new Studentlogin());
        return "studentlogin";
    }

       @GetMapping("/studentlogin/{sId}")
    public String show (Model model,@PathVariable long sId){
         Studentlogin studentlogin=studentloginRepo.findOne(sId);
        model.addAttribute("studentlogin", studentlogin);
        return "studentlogin";
    }
    
    
}
