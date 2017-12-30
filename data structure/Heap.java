package com.company;

import java.util.Arrays;

public class Heap{

    int capacity;
    int [] items;
    int size;
    public Heap(int capacity){
        this.capacity = capacity;
        items = new int[capacity];
        size = 0;

    }

    //Check if the heap is empty
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return this.size;
    }
    //Check if the heap is full
    public void isFull(){
        if(capacity == size){
            items = Arrays.copyOf(items,size *2);
            capacity *= 2;
        }
    }

    //Peek the root element of the heap
    public int peek(){
        if(isEmpty()) throw new IllegalStateException("Heap is empty");
        return items[0];
    }

    public int poll(){
        if(isEmpty()) throw new IllegalStateException("Heap is empty");
        int root = items[0];
        items[0] = items[size - 1];
        size --;
        bubbleDown();
        return root;
    }
    public void add(int item){
        isFull();
        items[size] = item;
        size ++;
        bubbleUp();
    }

    private void bubbleUp() {
        int index = size - 1;
        while(hasParent(index) && parent(index) >items[index]){
            swap(getParentIndex(index),index);
            index = getParentIndex(index);
        }
    }
    private void bubbleDown() {
        int index = 0;
        while(hasLeftChild(index)){
            int smallerChildIndex = getLeftChildIndex(index);
            if(hasRightChild(index) && rightChild(index) < leftChild(index)){
                smallerChildIndex = getRightChildIndex(index);
            }
            if (items[index] < items[smallerChildIndex])break;
            else swap(index,smallerChildIndex);
            index = smallerChildIndex;
        }
    }

    private boolean hasLeftChild(int index) {
        return (index * 2) +1 < size;
    }
    private boolean hasParent(int index) {
        return (index -1) /2  >=0;
    }
    private boolean hasRightChild(int index) {
        return (index * 2) +2 < size;
    }


    private int getLeftChildIndex(int parentIndex) {
        return (parentIndex * 2) +1;
    }
    private int getParentIndex(int childIndex) {
        return (childIndex - 1) /2;
    }
    private int getRightChildIndex(int parentIndex) {
        return (parentIndex * 2) +2;
    }


    private int rightChild(int index) {
        return items[getRightChildIndex(index)];
    }

    private int parent(int index) {
        return items[getParentIndex(index)];
    }
    private int leftChild(int index){
        return items[getLeftChildIndex(index)];
    }

    private void swap(int parentIndex, int index) {
        int temp = items[parentIndex];
        items[parentIndex] = items[index];
        items[index] = temp;
    }
    public void printHeap(){
        Arrays.stream(items).forEach(i -> System.out.print(i+" "));
    }

    //Driver method
    public static void main(String[] args) {
        Heap heap = new Heap(10);

        heap.add(50);
        heap.add(2);
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.printHeap();
        System.out.println();
        heap.poll();
        heap.poll();
        heap.poll();
        heap.peek();
        heap.printHeap();

    }


}
