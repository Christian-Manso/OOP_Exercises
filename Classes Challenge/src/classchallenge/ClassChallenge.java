/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classchallenge;
  
import classes.challenge.Account;

import java.util.Scanner;
  
          
        
/**
 *
 * @author User
 */

public class ClassChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account b = new Account();
        int accnum,phonenum;
        double deposit,withdraw,initial;
        String name,email;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter Name:");
        name = in.nextLine();
        System.out.println("Enter email:");
        email = in.nextLine();
        System.out.println("Enter Account Number:");
        accnum = in.nextInt();
        System.out.println("Enter phone number:");
        phonenum = in.nextInt();
        System.out.println("Enter initial amount:");
        initial = in.nextDouble();
        
        b.setName(name);
        b.setAccnum(accnum);
        b.setEmail(email);
        b.setPhonenum(phonenum);
        b.setBal(initial);
        
        System.out.println("Enter deposit amount:");
        deposit = in.nextDouble();
        
        boolean confirm = b.deposit(deposit);
        
        if(false==confirm){
            System.out.println("deposit Failed.");
        }
        else{
            
            b.display();
        }
        System.out.println("Enter withdraw amount:");
        withdraw = in.nextDouble();
        confirm = b.withdraw(withdraw);
        if(confirm==false){
            System.out.println("withdrawal Failed.");
        }
        else{
            b.display();
        }
    }
    
}
