/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:14 PM
 */
package Stack;

public class StackFromArray {
    int top;
    int[] arr;
    int size;
    StackFromArray(int capacity){
        size=capacity;
        top=-1;
        arr= new int[size];
    }
    void push(int ele)  {
        top++;
        arr[top]=ele;
    }
    void peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return ;
        }
        System.out.println("Peeked element: "+arr[top] );
    }
    int pop(){
        if(top==-1){
            System.out.print("Stack is empty");
            return 0;
        }
        int res=arr[top];
        top--;
        return res;
    }
    void isEmpty(){
        if(top==-1){
            System.out.println("Stack is empty----->");
        }
    }
    void size(){
        System.out.println("Size of Stack: "+ size);
    }
    void print(){
        System.out.print("Stack==> ");
        for (int ele:arr) {
            System.out.print(ele+" ");

        }
        System.out.println();
    }
}
class MainStackFromArray{
    public static void main(String[] args) {
        StackFromArray s= new StackFromArray(5);
        s.isEmpty();
        s.push(1);
        s.push(2);
        s.push(3);
        s.size();
        s.push(4);
        s.peek();
        s.push(5);
        s.print();
        System.out.println("popped element: "+s.pop());

    }
}

