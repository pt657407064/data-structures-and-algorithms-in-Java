/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Random;

/**
 * This is worst case example
 * Time complexity O(n^2)
Concept of Bubble sort
 Finding the largest number in an array put it in the end of the current soorting array if sort asc
 Finding the smallest number in an array put it in the end of the current sorting array if sort dec
Original	5 4 3 2 1
1st	 	4 3 2 1 5
2nd 		3 2 1 4 5
3rd 		2 1 3 4 5
4th		1 2 3 4 5
  */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums = new int[10];
        int count = 10;
        for(int i =0;i<10;i++){
            nums[i] = count;
            count--;
        }
        System.out.print("Original: ");
        for(int num: nums){
            System.out.print(num+" ");
        }
        System.out.println();
        for(int i=0;i<nums.length-1;i++)
        {
            //Flag to test best case for time complexity 
            boolean  swapped = false;
            for(int j = 1;j<nums.length;j++){
                if(nums[j]<nums[j-1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
        System.out.print("Sorted: ");
        for(int num: nums){
            System.out.print(num+" ");
        }
        System.out.println();
        
    }
    
}
