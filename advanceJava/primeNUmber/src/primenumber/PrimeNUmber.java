/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PrimeNUmber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Max,Min
        Scanner input = new Scanner(System.in);
        int[] inputs = new int[4];
        int max =0;
        int min =0;
        for(int i =0;i < inputs.length;i++){
            System.out.println("Enter a " + (i+1)+" th value");
            inputs[i] = input.nextInt();
            if(i == 0){
                 max =inputs[0];
                 min =inputs[0];
                  }
        if(max < inputs[i]){
            max = inputs[i];
        }
        if(min > inputs[i]){
            min = inputs[i];
        }
        
        
        }
        System.out.println("Maximum number "+ max+" Minimum number "+min);
        //Prime 
//    Scanner input = new Scanner(System.in);
//        System.out.println("Enter a integer number");
//        int n = input.nextInt();
//        int count = 0;
//        for(int i =1;i <=n;i++){
//            if(n%i == 0){
//                count++;
//            }
//        }
//    if(count == 2){
//        System.out.println("prime number");
//    }else{
//        System.out.println("not prime number");
//    }
   
        //Factorial
//        Scanner input = new Scanner(System.in);
//        System.out.println("Entre a number");
//            int n = input.nextInt();
//            System.out.println("Factorial on " + n + " is " +fab(n) );
    }
  //Factorial
//    public static int fab(int n){
//        if(n == 0){
//            return 1;
//        }
//    return n*fab(n-1);
//    }
}
