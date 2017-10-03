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
    public void enqueue(E element){
        if(numberOfItem +1 <= size){
            queue[rear] = element;
            if(rear == size -1) //So it will not have stackoverflow
                rear = 0;
            rear++;           
            numberOfItem++;
            System.out.println("Element added");
        }
        
    }
    public E peek(){
        return (E)queue[front];
    }
    public void dequeue(){
        System.out.println("Element Remove");
        if(numberOfItem > 0){
        queue[front] = null;
        if(front == size-1) //So it will not have stackoverflow
            front = 0;
        front ++;
        numberOfItem --;
        }
    }
    public static void main(String[] args) {
      Queue<String> queue = new Queue<>(10);
      while(true){
          queue.enqueue("Apple");
          queue.enqueue("Facebook");
          queue.enqueue("Google");
          queue.enqueue("Amazon");
          queue.enqueue("Oracle");
          queue.dequeue();
          queue.dequeue();
          queue.dequeue();
          queue.dequeue();
          queue.dequeue();
          
          queue.enqueue("Microsoft");
          queue.enqueue("AirBandB");
          queue.enqueue("Linkedin");
          queue.enqueue("Uber");
          queue.enqueue("Dell");
          queue.dequeue();
          queue.dequeue();
          queue.dequeue();
          queue.dequeue();
          
      }
      
    }
    
}