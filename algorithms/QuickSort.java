/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.Random;

/**
 *
 * @author taopa
 */
public class QuickSort {

    
    public static void main(String[] args) {
        int [] arrays = new int [30];
        System.out.println("Before Sorting");
        for(int i = 0 ; i < arrays.length;i++)
        { 
            arrays[i] = new Random().nextInt(100);
            System.out.print(arrays[i] + " ");
        }
        System.out.println("\nAfter sorting");
        
        quickSort(arrays,0,arrays.length-1);
        for(int i = 0; i<arrays.length;i++){
            System.out.print(arrays[i] + " ");
        }
        
        System.out.println();
        
        
            
        
        
    }
    public static void quickSort(int[] array, int low, int high){
        if (low < high){
            int pivot = partition(array,low,high);
            quickSort(array,low,pivot-1);
            quickSort(array,pivot+1,high);
        }
    }
    public static int partition(int[] array, int low, int high)
    {
        int p = array[high]; // Set the pivot to the most right,which is the high index
        int i = low-1; //This is the last index of element that is smaller than pivot, call it the wall
        for(int j = low; j < high;j++){
            //If the element smaller than pivot 
            //Then swap
            if (array[j] <= p){
                i ++; //Since an element now is smaller than pivot, we need to plus a index.
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
       
        //After finishing swap
       //Swap to the right index of the last element less than the pivot s
       int temp = array[i+1];
       array[i+1] = array[high];
       array[high] = temp;
       return i + 1; //return the index of the pivot 
    }
}
