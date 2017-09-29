/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Random;

/**
 *
 * @author taopa
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
        for(int i=0;i<9;i++)
        {
            for(int j = 1;j<10;j++){
                if(nums[j]<nums[j-1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
        System.out.print("Sorted: ");
        for(int num: nums){
            System.out.print(num+" ");
        }
        System.out.println();
        
    }
    
}
