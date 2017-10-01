/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.util.Random;

//Author Tao
//Concept:
// Finding the smallest number in an array put it in the first of the current sorting portion array if sort asc
// Finding the largest number in an array put it in the begining of current sorting potion of the array if sort dec
/*for example
original	5 4 3 2 1
1st sort	1 5 4 3 2 
2nd sort	1 2 5 4 3
3rd sort	1 2 3 5 4
4th sort	1 2 3 4 5
*/
public class SelectionSort {

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
      selectionSort(arrs);
      System.out.println("After Sorting");
      for(int i = 0; i < arrs.length;i++){
          System.out.print(arrs[i] + " ");
          
      }    
      System.out.println();
      
        
    }
    
    public static void selectionSort(int [] arrs){       
        for(int i = 0;i < arrs.length-1;i++){ 
            for(int j = i+1;j<arrs.length;j++){
                if(arrs[j]<arrs[i]){
                    int temp = arrs[i];
                    arrs[i] = arrs[j];
                    arrs[j] = temp;
                }
            }
        }
        
    }    
}
