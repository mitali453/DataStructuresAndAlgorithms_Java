/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:15 PM
 */
package Stack;

import java.util.ArrayList;

public class StackFromArrayList {
    ArrayList list = new ArrayList();


    void push(int ele) {
        list.add(ele);
    }

    int pop() {
        int res = (int) list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return res;
    }

    int peek() {
        int res = (int) list.get(list.size() - 1);
        return res;
    }

    boolean isEmpty() {
        return list.isEmpty();
    }

    int size() {
        return list.size();
    }
    void print(){
        System.out.print("Stack is: ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) +" ");
        }
        System.out.println();
    }
    void completeStackEmpty(){
        boolean a;
        for(int i=0;i<=list.size();i++){
            list.remove(i);
        }
    }

}
class StackArrayListMain{
    public static void main(String[] args) {
        StackFromArrayList s=new StackFromArrayList();
        System.out.println("Stack size : "+s.size());
        s.push(10);
        s.push(20);
        System.out.println("Top element by peek function : " +s.peek());
        s.push(30);
        s.print();
        System.out.println("Stack size : "+s.size());
        s.push(40);
        s.print();
        System.out.println("popped element : "+s.pop());
        System.out.println("Is Stack Empty : "+s.isEmpty());
        s.print();
        s.completeStackEmpty();
        s.print();
        System.out.println("Is Stack Empty : "+s.isEmpty());

    }
}

