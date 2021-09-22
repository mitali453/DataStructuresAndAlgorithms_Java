/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 9/14/2021
 *  Time: 9:06 PM
 */
package Queue;


class Node{
    int key;
    Node next;
    Node(int k){
        key=k;
        next=null;
    }
}

public class QueueFromLinkedList {
    public Node front, rear;
    QueueFromLinkedList(){
        rear=front=null;
    }

    public void enqueue(int key){
        Node temp=new Node(key);
        if(rear==null){
            rear=front=temp;
            return;
        }
        rear.next=temp;
        rear=temp;
    }

    public Node dequeue(){
        if(front==null){
            return null;
        }
        Node temp=front;
        front=front.next;
        if(front==null){
            rear=null;
        }
        return temp;
    }

}
class QueueLinkedListMain{
    public static void main(String[] args) {
        QueueFromLinkedList q= new QueueFromLinkedList();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Front is: "+ q.front.key );
        System.out.println("Rear is: "+q.rear.key);
        Node deletedElement = q.dequeue();
        System.out.println("deleted element is: "+deletedElement.key);
        System.out.println("Front is: "+ q.front.key );

    }
}
