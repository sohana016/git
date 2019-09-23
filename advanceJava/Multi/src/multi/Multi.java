/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi;

/**
 *
 * @author User
 */
public class Multi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] ary = {{10,5,2,3},{20,12,15,16}};
     ary =sorting(ary);
     for(int a = 0; a < ary.length;a++){
         for(int b = 0; b <ary[a].length;b++){
             System.out.print(ary[a][b]+"\t");
         }
         System.out.println("");
     }
    }
    public static int[][] sorting(int[][] arrays){
        for(int a = 0; a < arrays.length;a++){
            int[] nestedArray = arrays[a];
            for(int k=1;k<nestedArray.length;k++){
                for(int i = 0; i <nestedArray.length-k;i++){
                    if(nestedArray[i] > nestedArray[i+1]){
                        int temp = nestedArray[i];
                        nestedArray[i] = nestedArray[i+1];
                        nestedArray[i+1] =temp;
                    }
                }
            }
        }
    return arrays;
    }

}
