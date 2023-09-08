/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;

import java.util.Date;

/**
 *
 * @author User
 */
public class HourlyEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private float totalHoursWorked;
    private float ratePerHour;
    
    public HourlyEmployee(String name, int id){
        this.empID = id;
        this.empName = name;
    }
    public HourlyEmployee(String name, int id, Date dateHired, Date bdate){
        this.empID = id;
        this.empName = name;
        this.empDateHired = dateHired;
        this.empBirthDate = bdate;
    }
    
    public HourlyEmployee(String name, int id, Date dateHired, Date bdate, float totalHoursWorked, float ratePerHour){
        this.empID = id;
        this.empName = name;
        this.empDateHired = dateHired;
        this.empBirthDate = bdate;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    
    public void setEmpID(int empID){
        this.empID = empID;
    }
    
    public void setEmpName(String empName){
        this.empName = empName;
    }
    
    public void setEmpDateHired(Date empDateHired){
        this.empDateHired = empDateHired;
    }
    
    public void setEmpBirthDate(Date empBirthDate){
        this.empBirthDate = empBirthDate;
    }
    
    public void setTotalHoursWorked(float totalHoursWorked){
        this.totalHoursWorked = totalHoursWorked;
    }
    
    public void setRatePerHour(float ratePerHour){
        this.ratePerHour = ratePerHour;
    }
    
    public int getEmpID(){
        return this.empID;
    }
    
    public String getEmpName(){
        return this.empName;
    }
    
    public Date getEmpDateHired(){
        return this.empDateHired;
    }
    
    public Date getEmpBirthDate(){
        return this.empBirthDate;
    }
    
    public float getTotalHoursWorked(){
        return this.totalHoursWorked;
    }
    
    public float getRatePerHour(){
        return this.ratePerHour;
    }
    
    public double computeSalary(){
        double salary;
        float rate = getRatePerHour();
        float overtimehrs = getTotalHoursWorked() - 40;
        if(overtimehrs>0){
            salary = (40*rate) + (overtimehrs*rate*1.5); 
            return salary;
        }
        else{
            salary = getTotalHoursWorked()*rate;
            return salary;
        }
    }
    
    public void displayinfo(){
        System.out.println("Employee ID: " + getEmpID());
        System.out.println("Employee Name: " + getEmpName());
        System.out.println("Hired on: " + getEmpDateHired());
        System.out.println("Birthdate: " + getEmpBirthDate());
        System.out.println("Hours clocked in: " + getTotalHoursWorked());
        System.out.println("Hourly wage: " + getRatePerHour());
        System.out.println("Salary: " + computeSalary());
    }
    
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(String.format("Employee ID: " + getEmpID()));
        s.append(String.format("Employee Name: " + getEmpName()));
        s.append(String.format("Hired on: " + getEmpDateHired()));
        s.append(String.format("Birthdate: " + getEmpBirthDate()));
        s.append(String.format("Hours clocked in: " + getTotalHoursWorked()));
        s.append(String.format("Hourly wage: " + getRatePerHour()));
        s.append(String.format("Salary: " + computeSalary()));
        
        return s.toString();
    }
}
