/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:15 PM
 */
package Stack;

class StackNode{
    int data;
    StackNode next;
    StackNode(int data){
        this.data=data;
        next=null;
    }
}

public class StackFromLinkedList {
    StackNode head;
    int size;
    StackFromLinkedList(){
        head=null;
        size=0;
    }

    int sizeOfLinkedList(){
        return size;
    }
    boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }
    void peek() {
        if(head==null){
            System.out.println("Stack is empty");
            return ;
        }
        System.out.println("Peeked element is: "+head.data);
        return;
    }
    void push(int x){
        StackNode temp=new StackNode(x);
        temp.next=head;
        head=temp;
        size++;
    }
    int pop() {
        if(head == null){
            System.out.println("Stack is empty already");
            return 0;
        }
        int res=head.data;
        head=head.next;
        return res;
    }
    void print(){
        StackNode curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }

}

class Main0fLinkedListStack{
    public static void main(String[] args) {
        StackFromLinkedList s= new StackFromLinkedList();
        System.out.println("Is stack empty :" + s.isEmpty());
        s.peek();
        System.out.println("popped ele: "+ s.pop());
        s.push(10);
        s.push(20);
        s.peek();
        s.push(30);
        s.push(40);
        System.out.println("size of stack: "+ s.sizeOfLinkedList());
        System.out.println("popped ele: "+s.pop());
        System.out.println("Is stack empty :" + s.isEmpty());
        s.push(50);
        s.peek();
        s.push(60);
        System.out.println("size of stack: "+ s.sizeOfLinkedList());
        System.out.print("My stack is: ");
        s.print();
    }
}
