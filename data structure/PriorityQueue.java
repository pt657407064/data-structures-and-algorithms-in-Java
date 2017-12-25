//Still under construction
public class PriorityQueue {
    private int numberOfItem = 0;
    private int size;
    private int [] array;
    private int front = 0;

    public PriorityQueue(int size){
        this.size = size;
        array = new int[size];
    }
    public static void main(String [] args){
        PriorityQueue priorityQueue = new PriorityQueue(10);
        priorityQueue.priorityInsert(10);
        priorityQueue.priorityInsert(19);
        priorityQueue.priorityInsert(12);
        priorityQueue.priorityInsert(13);
        priorityQueue.priorityInsert(11);
        priorityQueue.priorityInsert(132);
        priorityQueue.priorityInsert(122);
        priorityQueue.priorityInsert(24);
        priorityQueue.priorityInsert(42);
        priorityQueue.priorityInsert(52);
        priorityQueue.display();
    }

    public void display() {
        for(int i = front; i < numberOfItem;i++){
            System.out.println(array[i]);
        }
    }
    public void remove(){
        front ++;
    }
    public void clear(){
        array = new int[size];
    }

    public boolean isEmpty(){
        return numberOfItem == 0;
    }
    public boolean isFull(){
        return numberOfItem == size;
    }
    public int size(){
        return numberOfItem;
    }
    public void peek(){
        System.out.println(array[front]);
    }

    public void priorityInsert(int element){
        if(isFull()) return;
        if(isEmpty()) array[0] = element;
        int pos = numberOfItem;
        for(int i = numberOfItem-1;i>=0;i--){
            if(array[i] < element){
                array[i+1] = array[i];
                pos = i;
            }
            else break;
        }
        array[pos] = element;
        numberOfItem++;
    }
}
