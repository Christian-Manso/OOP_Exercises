package employee.version1;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class BasePlusCommissionEmployee{
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private double totalSales;
    private double baseSalary;
    
    public BasePlusCommissionEmployee(String name, int id){
        this.empID = id;
        this.empName = name;
    }
    public BasePlusCommissionEmployee(String name, int id, Date dateHired, Date bdate){
        this.empID = id;
        this.empName = name;
        this.empDateHired = dateHired;
        this.empBirthDate = bdate;
    }
    
    public BasePlusCommissionEmployee(String name, int id, Date dateHired, Date bdate, double totalSales, double baseSalary){
        this.empID = id;
        this.empName = name;
        this.empDateHired = dateHired;
        this.empBirthDate = bdate;
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
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
    
    public void setTotalSales(Double totalSales){
        this.totalSales = totalSales;
    }
    
    public void setBaseSalary(Double baseSalary){
        this.baseSalary = baseSalary;
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
    
    public double getTotalSales(){
        return this.totalSales;
    }
    
    public double getBaseSalary(){
        return this.baseSalary;
    }
    
    public double computeSalary(){
        double salary = getBaseSalary();        
        double sales = getTotalSales();
        double com;
        
        if(sales<50000){
        com = 0.05;
        }
        else if(sales>=50000&&sales<100000){
        com = 0.2;
        }
        else if(sales>=100000&&sales<500000){
        com = 0.3;
        }
        else{
        com = 0.5;
        }
    
        salary += sales*com; 
        return salary;  
    }
    
    public void displayinfo(){
        System.out.println("Employee ID: " + getEmpID());
        System.out.println("Employee Name: " + getEmpName());
        System.out.println("Hired on: " + getEmpDateHired());
        System.out.println("Birthdate: " + getEmpBirthDate());
        System.out.println("Total sales: " + getTotalSales());
        System.out.println("Base salary: " + getBaseSalary());
        System.out.println("Salary: " + computeSalary());
    }
    
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(String.format("Employee ID: " + getEmpID()));
        s.append(String.format("Employee Name: " + getEmpName()));
        s.append(String.format("Hired on: " + getEmpDateHired()));
        s.append(String.format("Birthdate: " + getEmpBirthDate()));
        s.append(String.format("Total sales: " + getTotalSales()));
        s.append(String.format("Base salary: " + getBaseSalary()));
        s.append(String.format("Salary: " + computeSalary()));
        
        return s.toString();
    }
}
