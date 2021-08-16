/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:27 PM
 */
package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidth {
    int key;
    MaximumWidth left;
    MaximumWidth right;

    MaximumWidth(int k) {
        key = k;
    }
}

class MaxWidthMain {
    public static int maximumWidth(MaximumWidth root) {
        if (root == null) {
            return 0;
        }
        Queue q = new LinkedList();
        q.add(root);
        int res = 0;
        while (q.isEmpty() == false) {
            int count = q.size();
            res = Math.max(res, count);
            for (int i = 0; i < count; i++) {
                MaximumWidth curr = (MaximumWidth) q.poll();
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null){
                    q.add(curr.right);
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        MaximumWidth root = new MaximumWidth(10);
        root.left = new MaximumWidth(20);
        root.left.left = new MaximumWidth(40);
        root.left.right = new MaximumWidth(50);
        root.right = new MaximumWidth(30);
        root.right.right = new MaximumWidth(70);
        root.right.left= new MaximumWidth(80);
        int result=  maximumWidth(root);
        System.out.println("Maximum width of the tree is: "+ result);
    }
}

