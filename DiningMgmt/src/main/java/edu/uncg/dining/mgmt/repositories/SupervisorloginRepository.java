/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uncg.dining.mgmt.repositories;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import edu.uncg.dining.mgmt.models.Supervisorlogin;
/**
 *
 * @author shrav
 */
public interface SupervisorloginRepository extends JpaRepository<Supervisorlogin, Long> {
    
}