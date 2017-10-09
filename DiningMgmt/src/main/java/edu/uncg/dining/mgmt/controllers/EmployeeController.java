/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uncg.dining.mgmt.controllers;
import edu.uncg.dining.mgmt.models.Employee;
import edu.uncg.dining.mgmt.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
/**
 *
 * @author komalkubsad
 */
@Controller
public class EmployeeController{
    
    @Autowired
    private EmployeeRepository employeeRepo;
    
    @PostMapping("/employee")
    public void save(Employee employee){
                System.out.println("Saving...");
                employeeRepo.save(employee);
                        
                        
                        
    }
    
    @GetMapping("/employee")
    public String show (Model model){
        model.addAttribute("employee", new Employee());
        return "employee";
    }

       @GetMapping("/employee/{empId}")
    public String show (Model model,@PathVariable long empId){
        Employee employee=employeeRepo.findOne(empId);
        model.addAttribute("employee", employee);
        return "employee";
    }
  
   
    
    
}
