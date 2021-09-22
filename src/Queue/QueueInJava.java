/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 9/14/2021
 *  Time: 9:50 PM
 */
package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueInJava {
    public static void main(String[] args) {
        Queue q= new ArrayDeque();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        System.out.println(q);
        System.out.println("Top of the queue: " + q.peek());
        System.out.println("Dequed element " + q.poll());
        System.out.println(q);
    }
}
