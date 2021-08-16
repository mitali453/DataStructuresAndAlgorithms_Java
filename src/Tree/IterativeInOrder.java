/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/12/2021
 *  Time: 1:57 PM
 */
package Tree;

import java.util.Stack;

public class IterativeInOrder {
    IterativeInOrder left;
    IterativeInOrder right;
    int key;

    IterativeInOrder(int k) {
        key = k;
    }
}

class IterativeMain {
    public static void inOrder(IterativeInOrder root) {
        Stack st = new Stack<>();
        IterativeInOrder curr = root;
        while (curr != null || st.isEmpty() == false) {
            while (curr != null) {
                st.add(curr);
                curr=curr.left;

            }
            curr = (IterativeInOrder) st.pop();
            System.out.print(curr.key + " ");
            curr = curr.right;
        }
    }

    public static void main(String[] args) {
        IterativeInOrder root=new IterativeInOrder(10);
        root.left=new IterativeInOrder(20);
        root.right=new IterativeInOrder(30);
        root.left.left=new IterativeInOrder(40);
        root.left.right=new IterativeInOrder(50);
        inOrder(root);
    }
}

