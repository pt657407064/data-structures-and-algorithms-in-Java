/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.util.Random;

/**
 *
 * @author taopa
 */
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arrays = new int[30];
        for(int i = 0; i < 30 ; i++)
            arrays[i] = new Random().nextInt(100);
        System.out.println("Before Sorting");
        for(int i = 0 ; i < 30;i++)
            System.out.print(arrays[i]+" ");
        mergeSort(arrays,0,arrays.length-1);
        System.out.println();
        System.out.println("After Sorting");
        for(int i = 0; i < 30 ; i ++)
            System.out.print(arrays[i]+ " ");
        System.out.println();
        
        
    }
    public static void mergeSort(int[] arrays,int low, int high)
    {
        //Recursion
        if (low < high){
            int mid = (low + high)/2;
            mergeSort(arrays,low,mid);
            mergeSort(arrays,mid+1,high);
            merge(arrays,low,high,mid);
        }
    }
    
    public static void merge(int [] arrays, int low, int high , int mid){
        int n1 = mid - low + 1;
        int n2 = high - mid;
        
        int [] firstArray = new int[n1];
        int [] secondArray = new int[n2];
        
        for(int i = 0; i < n1; i ++)
            firstArray[i] = arrays[i+low];
        for(int i = 0;i < n2 ; i ++)
            secondArray[i] = arrays[mid+i+1];
        
        int indexOfFirstArray = 0, indexOfSecondArray = 0;
        int f = low;
        while(indexOfFirstArray < n1 && indexOfSecondArray < n2){
            if(firstArray[indexOfFirstArray] <= secondArray[indexOfSecondArray]){
                arrays[f] = firstArray[indexOfFirstArray];
                indexOfFirstArray++;
            }
            else
            {
                arrays[f] = secondArray[indexOfSecondArray];
                indexOfSecondArray++;                       
            }
            f++;
        }   
        while(indexOfFirstArray < n1){
            arrays[f] = firstArray[indexOfFirstArray];
            indexOfFirstArray++;
            f++;
        }
        
        while(indexOfSecondArray < n2){
            arrays[f] = secondArray[indexOfSecondArray];
            indexOfSecondArray++;
            f++;
        }
        System.out.print(" ");
        
    }
}
