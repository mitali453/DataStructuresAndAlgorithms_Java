/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 9/14/2021
 *  Time: 11:14 PM
 */
package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Reversing {
    public static void reverse(Queue q) {
        Stack s= new Stack();
        while(!q.isEmpty()){
            s.add(q.poll());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        System.out.println(q);
    }

    public static void main(String[] args) {
        Queue q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        System.out.println(q);
        reverse(q);
    }
}

