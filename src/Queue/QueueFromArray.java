/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 9/14/2021
 *  Time: 4:24 PM
 */
package Queue;

public class QueueFromArray {
    public int cap, rear, front;
    int[] arr;
    int size;

    QueueFromArray(int c) {
        cap = c;
        size = 0;
        front = size;
        rear = cap - 1;
        arr = new int[cap];
    }

    public boolean isFull() {
        return cap == size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        } else {
            return arr[front];
        }
    }
    public int getRear() {
        if (isEmpty()) {
            return -1;
        } else {
            return arr[rear];
        }
    }
    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("Completely filled");
            return;
        } else {
            rear = (rear + 1) % cap;
            arr[rear] = x;
            size++;
        }
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("No, item to delete");
            return 0;
        }
        int item= arr[front];
        int index=front;
        front= (front+1)%cap;
        size--;
        arr[index]=-1;
        return item;
    }
    public void size(){
        System.out.println("size is: "+size);
    }
    public void print(){
        for (int x: arr
             ) {
            System.out.print(x +" ");

        }
    }

}

class ArrayMain {
    public static void main(String[] args) {
        QueueFromArray q= new QueueFromArray(4);
        q.enqueue(10);
        System.out.println("Rear is: "+ q.getRear());
        q.enqueue(20);
        System.out.println("Front is: "+q.getFront());
        q.enqueue(30);
        System.out.println("Deleted element is: "+ q.dequeue());
        System.out.println("Deleted element is: "+ q.dequeue());
        System.out.println("Deleted element is: "+ q.dequeue());
        System.out.println("Rear is: "+ q.getRear());
        System.out.println("Queue:");
        q.size();
        q.print();


    }
}