/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibinacinumber;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class FibinaciNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in); 
            System.out.println("Enter a number");
                int n = input.nextInt();
                    System.out.println("Fibonaci on " + n + " is " +fab(n));
            
    }
   public static int fab(int n){
       if(n == 0){
           return 0;
       }else if(n == 1){
           return 1;
       }
       return fab(n-1)+ fab(n-2);
   }
}