/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int[] list = {5,20,14,17,1};
        Scanner input = new Scanner(System.in);
        int[] list = new int[4];
            for(int  i= 0;i < list.length;i++){
                System.out.println("Enter a number");
                list[i] = input.nextInt();
            }
            
            System.out.println("");
            
        list = bubbleSort(list);
        for(int val : list){
            System.out.print(val+" ");
        }
    }
   
    public static int[] bubbleSort(int[] list){
        for(int k =1; k < list.length;k++){
                for(int i = 0; i < list.length-k;i++){
                    if(list[i] > list[i+1]){
                        int temp = list[i];
                        list[i] = list[i+1];
                        list[i+1] =temp;
                    }
                }
            }
        return list;
    }
}
