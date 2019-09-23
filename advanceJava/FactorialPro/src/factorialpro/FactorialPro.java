/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialpro;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class FactorialPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= input.nextInt();
        System.out.println("Factorial on "+n +" is " + fact(n));
    
    }
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        return n*fact(n-1);
    }
}
