/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidenceproject;

/**
 *
 * @author User
 */
public class EvidenceProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Multidaymentional ArraySort
        int[][] ary = {
            {10,6,3,8,1},
            {21,24,10,5,4},
            {50,10,40,30,20}
        };
//        ary = sorting(ary);
          int sum =0;  
        for(int a = 0;a <ary.length;a++){
            for(int b = 0; b <ary[a].length;b++){
                System.out.print(ary[a][b]+"\t");
            }
        System.out.println("");
        }
       for(int a = 0;a <ary.length;a++){
           for(int b = 0;b<ary[a].length;b++){
               sum  += ary[a][b];
           }
       }
        System.out.println(sum+"");
    }
    //Multidaymentional
//    public static int[][] sorting(int [][] arrays){
//        for(int a =0;a < arrays.length;a++){
//            int[] nestedArray = arrays[a];
//            for(int k =1; k < nestedArray.length;k++){
//                for(int i = 0; i < nestedArray.length-k;i++){
//                    if(nestedArray[i] > nestedArray[i+1]){
//                        int temp = nestedArray[i];
//                        nestedArray[i] = nestedArray[i+1];
//                        nestedArray[i+1] =temp;
//                    }
//                }
//            }
//        }
//        
//        return arrays;
//    } 
    
}
