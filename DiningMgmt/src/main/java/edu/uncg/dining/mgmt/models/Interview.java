/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uncg.dining.mgmt.models;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author komalkubsad
 */
@Entity
@Table (name = "Interview")
public class Interview {
    
    
    private String candidateName;
    private int interviewTime;
    private int interviewDate;
    private String selectionStatus;

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public int getInterviewTime() {
        return interviewTime;
    }

    public void setInterviewTime(int interviewTime) {
        this.interviewTime = interviewTime;
    }

    public int getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(int interviewDate) {
        this.interviewDate = interviewDate;
    }

    public String getSelectionStatus() {
        return selectionStatus;
    }

    public void setSelectionStatus(String selectionStatus) {
        this.selectionStatus = selectionStatus;
    }
    
    
}
