/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.Arrays;

/**
 *
 * @author taopa
 */
public class Queue<E> {

    
    int front,rear, numberOfItem = 0;
    Object [] queue;
    int size = 0;
    public Queue(int size){
        this.size = size;
        queue = new Object[size];
    }
    public void insert(E element){
        if(numberOfItem +1 <= size){
            queue[rear] = element;
            if(rear == size -1)
                rear = 0;
            rear++;           
            numberOfItem++;
            System.out.println("Element added");
        }
        
    }
    public E peek(){
        return (E)queue[front];
    }
    public void remove(){
        System.out.println("Element Remove");
        if(numberOfItem > 0){
        queue[front] = null;
        if(front == size-1)
            front = 0;
        front ++;
        numberOfItem --;
        Object[] tempQ = new Object[size];
        }
    }
    public static void main(String[] args) {
      Queue<String> queue = new Queue<>(10);
      while(true){
          queue.insert("Apple");
          queue.insert("Facebook");
          queue.insert("Google");
          queue.insert("Amazon");
          queue.insert("Oracle");
          queue.remove();
          queue.remove();
          queue.remove();
          queue.remove();
          queue.remove();
          
          queue.insert("Microsoft");
          queue.insert("AirBandB");
          queue.insert("Linkedin");
          queue.insert("Uber");
          queue.insert("Dell");
          queue.remove();
          queue.remove();
          queue.remove();
          queue.remove();
          
      }
      
    }
    
}
