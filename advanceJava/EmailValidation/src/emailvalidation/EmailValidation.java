/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailvalidation;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EmailValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input  = new Scanner(System.in);
            System.out.println("Enter a email");
            String email = input.nextLine();
            int adPos = email.indexOf("@");
            int dotPos = email.lastIndexOf(".");
            if(adPos>1 && dotPos > adPos){
                System.out.println("Email is Valid ");
            }else{
                System.out.println("Email is Invalid");
            }
    }
    
}
