/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcp;

import java.util.Random;

//Finding the greatest common divisior of two number
public class Gcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = new Random().nextInt(10000);
        int b = new Random().nextInt(10000);
        if(a > b){
            int number = find(a,b);
            System.out.println(a +" and "+ b + ": "+number);
        }
        else{           
            int number = find(b,a);
            System.out.println(a +" and "+ b + ": "+number);
        }
        
    }
    public static int find(int bigger, int smaller){
        if(smaller == 0){
            return bigger;
        }
            return find(smaller,bigger%smaller);           
    }
    
}
