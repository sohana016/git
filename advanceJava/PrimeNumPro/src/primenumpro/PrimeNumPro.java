/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumpro;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PrimeNumPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
            System.out.println("Enter a number");
                int n = input.nextInt();
                int count =0;
               for(int i = 1;i<=n;i++){
                   if(n%i == 0){
                       count++;
                   }
               } 
        if(count == 2){
            System.out.println("Prime number");
        }else{
            System.out.println("Not Prome Number");
        }
    }
    
}
