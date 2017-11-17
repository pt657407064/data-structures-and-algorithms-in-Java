package com.company;

public class Fib_DP {

    public static void main(String[] args) {
	// write your code here
        System.out.println(fib(10));
        System.out.println(fib2(10));
        System.out.println(fib3(10));
    }
    //traditional recursion
    //Time complexity O(2^N) space complexity O(1)
    public static int fib(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        else return fib(n-1)+fib(n-2);

    }

    //memorizing
    //Time complexity O(N) space O(N)
    public static int fib2(int n){
        int nums [] = new int[n+1];
        nums[0] = 0;
        nums[1] =1;
        for(int i = 2;i<=n;i++){
            nums[i] = nums[i-1] +nums[i-2];
        }
        return nums[n];
    }

    //Space optimization
    //Time Complexity O(N) space O(1)
    public static int fib3(int n){
        int a = 0,b=1; //a = fib(n-2) b = f(n-1)
        int c = 0; // Sum of previous f(n-1)+f(n-2)
        int z = 2; // Start from 2 -> n
        while(z <= n){
            c = a+b;
            a=b;
            b=c;
            z++;
        }
        return c;

    }
}
