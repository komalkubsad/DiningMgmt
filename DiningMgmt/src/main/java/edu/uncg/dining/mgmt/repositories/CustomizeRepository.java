/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uncg.dining.mgmt.repositories;

import edu.uncg.dining.mgmt.models.Customize;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author shrav
 */
public interface CustomizeRepository extends JpaRepository<Customize, Long>{
    
}
