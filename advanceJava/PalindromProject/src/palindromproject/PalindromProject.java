/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromproject;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PalindromProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //oddEven
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number");
//            int n = input.nextInt();
//            if(n%2 == 0){
//                System.out.println("even");
//            }else{
//                System.out.println("odd");
//            }
        //palindrom
    Scanner input = new Scanner(System.in);
        System.out.println("Enter a palindrom or a string");
            String s1 = input.nextLine();
            StringBuffer sb = new StringBuffer(s1);
            String s2 = sb.reverse().toString();
            if(s1.equals(s2)){
                System.out.println("is palindrom");
            }else{
                System.out.println("is not palindrom");
            }
        //Sentinal
//              int sum =0;
//            Scanner input = new Scanner(System.in);
//                for(int i =0;;i++){
//                    System.out.println("Enter a number");
//                        int x= input.nextInt();
//                            if(x != -1){
//                                sum += x;
//                            }else{
//                                break;
//                            }
//                }
//                System.out.println(""+sum);
//               double sum =0;
//           Scanner input = new Scanner(System.in);
//            double[] list = new double[3];
//            for(int i = 0; i < list.length;i++){
//                System.out.println("Enter a " +(i+1)+" th value");
//                    list[i] = input.nextInt();
//                    
//            }
//            for(int i = 0; i < list.length;i++){
//                sum += list[i];
//            }
//                double avg = sum/list.length;
//                System.out.println(sum+"");
//                   System.out.println(avg+""); 
   
        //
    
    }
    
}
