/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencetest;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EvidenceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // MAx,MIn number
        Scanner input = new Scanner(System.in);
        int[] inputs = new int[4];
        int max = 0;
         int min = 0;
         for(int i = 0; i < inputs.length;i++){
             System.out.println("Enter a " +(i+1)+ " th value ");
             inputs[i] = input.nextInt();
             if(i == 0){
                 max = inputs[0];
                 min = inputs[0];
             }
             if(max < inputs[i]){
                 max = inputs[i];
             }
             if(min > inputs[i]){
                 min = inputs[i];
             }
         }
         System.out.println("max "+ max+" min" +min);
        //MultiDaymention ArraySort
//        int[][] ary = {
//            {5,6,0,7,9,2},
//            {8,2,6,10,15,12},
//            {20,14,13,19,11,5}
//        };
//        ary = sorting(ary);
//            for(int a = 0; a < ary.length;a++){
//                for(int b = 0; b < ary[a].length;b++){
//                    System.out.print(ary[a][b]+"\t");
//                }
//                System.out.println("");
//            }
        
    
    
    
    }
    //MultiDaymention ArraySort
//public static int[][] sorting(int[][] arrays){
//    for(int a= 0; a < arrays.length;a++){
//        int[] nestedArray = arrays[a];
//            for(int k =1; k < nestedArray.length;k++){
//                for(int i =0; i < nestedArray.length -k;i++){
//                    if(nestedArray[i] > nestedArray[i+1]){
//                        int temp = nestedArray[i];
//                        nestedArray[i] = nestedArray[i+1];
//                        nestedArray[i+1] = temp;
//                    }
//                }
//            }
//    }
//    return arrays;
//}
    //
}
