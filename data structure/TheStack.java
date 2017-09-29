/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thestack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;

/**
 *
 * @author taopa
 */
public class TheStack <E> implements Serializable{
    int size;
    int topOfStack = -1;
    Object stack[];
    public TheStack(int size){
        this.size = size;
        this.stack = new Object[size];
        
    }

    public void push(E obj){
        if(topOfStack+1 < size)
        {
            topOfStack++;
            stack[topOfStack] = obj; 
        }else System.out.println("Stack is full");
    }
    public E pop(){
        
        if(topOfStack >=0)
        {
            E tem = (E)stack[topOfStack];            
            stack[topOfStack] = null;
            topOfStack -=1;            
            return tem;
        }else return null;
        
        
    } 
    public void pushMany(E ... objs){
        for(E obj:objs){
            push(obj);
        }
    }
    public void display()
    {
        while(topOfStack>-1)
        {
            System.out.println(stack[topOfStack]);
            topOfStack--;
        }
    }
    public void popAll(){
        for(Object e: stack)
        {
            pop();
        }
    }
    public void peek(){
        System.out.println(stack[topOfStack]);
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
       
        TheStack<String> stack = new TheStack(10);
        stack.push("10");
        stack.pushMany("tao","pan","hello");
        //stack.peek();
        
        File f = new File("stack.ser");
        FileOutputStream fo = new FileOutputStream(f);
        ObjectOutputStream obj = new ObjectOutputStream(fo);
        obj.writeObject(stack);
        
        FileInputStream fi = new FileInputStream(f);
        ObjectInputStream oi = new ObjectInputStream(fi);
        TheStack<String> read = (TheStack<String>)oi.readObject();
        read.peek();
                
        }
    
    

}
