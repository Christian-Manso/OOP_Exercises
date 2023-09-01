/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.challenge;

/**
 *
 * @author User
 */
public class Account {

        private int accnum;
        private double bal;
        private String name;
        private String email;
        private int phonenum;
        
        
        public int getAccnum(){
            return accnum;
        }
        public double getBal(){
            return bal;
        }
        public String getName(){
            return name;
        }
        public String getEmail(){
            return email;
        }
        public int getPhonenum(){
            return phonenum;
        }
        
        public void setAccnum(int newNum){
            this.accnum = newNum;
        }
        public void setBal(double newBal){
            this.bal = newBal;
        }
        public void setName(String newName){
            this.name = newName;
        }
        public void setEmail(String newEmail){
            this.email = newEmail;
        }
        public void setPhonenum(int newPhonenum){
            this.phonenum = newPhonenum;
        }
    
    
    
    public boolean deposit(double deposit){
        if (deposit<0){
            return false;
        }
        else{

        double cash = getBal();
       
        cash += deposit;
        
        setBal(cash);
        return true;
        }
    }
    
    public boolean withdraw(double withdraw){
       
        double cash = getBal();
        if(withdraw>cash){
            return false;
        }
        else{
        cash -= withdraw;
        setBal(cash);
        return true;
        }
    }
    
    public void display(){
       
        int accnum = getAccnum();
        double cash = getBal();
        String name = getName();
        String email = getEmail();
        int phonenum = getPhonenum();
        System.out.println("Mr/Ms " + name + ", with account Number: " + accnum + ", Email: " + email + ", Contact: " + phonenum + ", your Balance is: " + cash);
    }
    
}
