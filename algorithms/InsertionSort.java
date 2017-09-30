/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

import java.util.Random;

/**
 *
 * @author taopa
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int [] arrs = new int[30];
      
      System.out.println("Before Sorting");
      for(int i =0;i<30;i++){
          arrs[i] = new Random().nextInt(100)+2;
          System.out.print(arrs[i]+" ");
      }
      System.out.println();
      insertionSort(arrs);

      System.out.println("After Sorting");
      for(int i = 0; i < arrs.length;i++){
          System.out.print(arrs[i] + " ");
          
      }    
      System.out.println();
    }

    public static void insertionSort(int [] arrs){
        for(int i = 0;i <arrs.length-1;i++){
            for(int j = i+1;j>0;j--){
                if(arrs[j]<arrs[j-1]){
                    int temp = arrs[j];
                    arrs[j] = arrs[j-1];
                    arrs[j-1] = temp;
                }
            }
        }
        
    }    
}
