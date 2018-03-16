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
            System.out.println(queue[rear] + " added");
            if(rear == size -1) //So it will not have stackoverflow
                rear = -1;//Go back to the -1 because we have front ++ follow to make it to index 0
            rear++;
            numberOfItem++;

        }
    }
    public E peek(){
        return (E)queue[front];
    }
    public void dequeue(){
        if(numberOfItem > 0){
        System.out.println(queue[front].toString() +" Removeed");
        queue[front] = null;
        if(front == size-1) //So it will not have stackoverflow
            front = -1; //Go back to the -1 because we have front ++ follow to make it to index 0
        front ++;
        numberOfItem --;
        }
    }
    public static void main(String[] args) {
      Queue<String> queue = new Queue<>(2);
      h: while(true){
          queue.enqueue("Apple");
          queue.enqueue("Facebook");
          queue.dequeue();
          queue.dequeue();
          queue.enqueue("Google");
          queue.enqueue("Amazon");
          queue.enqueue("Oracle");
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
          break h;

      }

    }

}
