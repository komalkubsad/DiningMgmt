/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uncg.dining.mgmt.controllers;

import edu.uncg.dining.mgmt.models.Employee;
import edu.uncg.dining.mgmt.models.Menu;
import edu.uncg.dining.mgmt.repositories.EmployeeRepository;
import edu.uncg.dining.mgmt.repositories.MenuRepository;
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
public class MenuController {
    @Autowired
    private MenuRepository menuRepo;
    
    @PostMapping("/menu")
    public void save(Menu menu){
                System.out.println("Saving...");
                menuRepo.save(menu);
                        
                        
                        
    }
    
    @GetMapping("/menu")
    public String show (Model model){
        model.addAttribute("menu", new Menu());
        return "menu";
    }

       @GetMapping("/menu/{menuId}")
    public String show (Model model,@PathVariable long menuId){
        Menu menu=menuRepo.findOne(menuId);
        model.addAttribute("menu", menu);
        return "employee";
    }
    
}
