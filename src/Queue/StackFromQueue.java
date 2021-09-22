/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 9/14/2021
 *  Time: 9:55 PM
 */
package Queue;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class StackFromQueue {
    static class Stack{
        Queue q1= new LinkedList<Integer>();
        Queue q2= new LinkedList<Integer>();
        int size;
        Stack(){
            size=0;
        }
        void push(int x){
            size++;
            while(!q1.isEmpty() ) {
                q2.add(q1.poll());
            }
            q1.add(x);
            while(!q2.isEmpty()){
                q1.add(q2.poll());
            }
        }
        int getFront(){
            if(q1.size()==0){
                return -1;
            }
            return (int) q1.peek();
        }
        int Dequeue(){
            if(q1.isEmpty())   {
                return -1;
            }
            int a= (int) q1.remove();
            size--;
            return a;
            
        }
        int size(){
            return size;
        }

    }

    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println("Front is: " + s.getFront()); 
        System.out.println("Dequed Element: " + s.Dequeue());
        System.out.println("Size: "+ s.size());
        System.out.println("Front is: " + s.getFront());
        

    }
}
