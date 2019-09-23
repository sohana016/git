/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multidayarray;

/**
 *
 * @author User
 */
public class MultiDayArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
//        int[][] ary = new int[3][2];
//        ary[0][0] = 0;
//        ary[0][1] = 1;
//    
//         ary[1][0] = 0;
//         ary[1][1] = 1; 
//        
//         ary[2][0] = 0;
//         ary[2][1] = 1;
//        
//        for(int i = 0; i< ary.length;i++){
//            for(int k =0; k< ary[i].length;k++){
//                System.out.println("Row "+i+" col "+ary[i][k] );
//            }
//        } 
    //Multidymentional ArraySort
            
    int[][] ary = {
        {3,5,67,3,4},
        {5,7,3,6,7},
        {5,6,2,3,10}
    };
    ary = sorting(ary);
        for(int a = 0;a < ary.length;a++){
            for(int b = 0;b < ary[a].length;b++){
                System.out.print(ary[a][b]+"\t");
            }
            System.out.println("");
        }
                }
  public static int[][] sorting(int[][] arrays){
      //Step 1:get array item
      for(int a = 0;a < arrays.length;a++){
          int[] nestedArray = arrays[a];
               for(int k =1;k < nestedArray.length; k++){
              for(int i = 0;i < nestedArray.length-k;i++){
                 if(nestedArray[i] > nestedArray[i+1]){
                     int temp = nestedArray[i];
                     nestedArray[i] = nestedArray[i+1];
                     nestedArray[i+1] = temp;
                 }           
              }        
          }     
      }      
      return arrays;
  }    
    }  

