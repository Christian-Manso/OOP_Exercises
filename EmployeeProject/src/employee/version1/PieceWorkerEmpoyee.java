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
public class PieceWorkerEmpoyee{
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private int totalPiecesFinished;
    private float ratePerPiece;
    
    
    public PieceWorkerEmpoyee(String name, int id){
        this.empID = id;
        this.empName = name;
    }
    public PieceWorkerEmpoyee(String name, int id, Date dateHired, Date bdate){
        this.empID = id;
        this.empName = name;
        this.empDateHired = dateHired;
        this.empBirthDate = bdate;
    }
    
    public PieceWorkerEmpoyee(String name, int id, Date dateHired, Date bdate, int totalPiecesFinished, float ratePerPiece){
        this.empID = id;
        this.empName = name;
        this.empDateHired = dateHired;
        this.empBirthDate = bdate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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
    
    public void setPiecesFinished(int totalPiecesFinished){
        this.totalPiecesFinished = totalPiecesFinished;
    }
    
    public void setRatePerPiece(float ratePerPiece){
        this.ratePerPiece = ratePerPiece;
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
    
    public int getTotalPiecesFinished(){
        return this.totalPiecesFinished;
    }
    
    public float getRatePerPiece(){
        return this.ratePerPiece;
    }
    
    
    public double computeSalary(){
        int pieces = getTotalPiecesFinished();
        double salary;
        float rate = getRatePerPiece();
        int bonuscount = pieces % 100;
    
        salary = (pieces*rate) + (bonuscount*rate*10); 
        return salary;
        
    }
    
    public void displayinfo(){
        System.out.println("Employee ID: " + getEmpID());
        System.out.println("Employee Name: " + getEmpName());
        System.out.println("Hired on: " + getEmpDateHired());
        System.out.println("Birthdate: " + getEmpBirthDate());
        System.out.println("Pieces finished: " + getTotalPiecesFinished());
        System.out.println("Price per piece: " + getRatePerPiece());
        System.out.println("Salary: " + computeSalary());
    }
    
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(String.format("Employee ID: " + getEmpID()));
        s.append(String.format("Employee Name: " + getEmpName()));
        s.append(String.format("Hired on: " + getEmpDateHired()));
        s.append(String.format("Birthdate: " + getEmpBirthDate()));
        s.append(String.format("Pieces finished: " + getTotalPiecesFinished()));
        s.append(String.format("Price per piece: " + getRatePerPiece()));
        s.append(String.format("Salary: " + computeSalary()));
        
        return s.toString();
    }
}
