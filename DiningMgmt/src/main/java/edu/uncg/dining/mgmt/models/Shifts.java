/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uncg.dining.mgmt.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author komalkubsad
 */
@Entity
@Table (name = "Shifts")
public class Shifts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private long shiftId;
    private long employeeId;
    private String employeeName;
    private double checkIn;
    private double checkOut;
    private int breakTime;
    private int totalWorkingHrs;
    private int date;
    

    public long getShiftId() {
        return shiftId;
    }

    public void setShiftId(long shiftId) {
        this.shiftId = shiftId;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(double checkIn) {
        this.checkIn = checkIn;
    }

    public double getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(double checkOut) {
        this.checkOut = checkOut;
    }

    public int getBreakTime() {
        return breakTime;
    }

    public void setBreakTime(int breakTime) {
        this.breakTime = breakTime;
    }

    public int getTotalWorkingHrs() {
        return totalWorkingHrs;
    }

    public void setTotalWorkingHrs(int totalWorkingHrs) {
        this.totalWorkingHrs = totalWorkingHrs;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
    
    
    
}
