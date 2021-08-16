/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/12/2021
 *  Time: 2:22 PM
 */
package Tree;

import java.util.Stack;

public class IterativePreOrder {
    IterativePreOrder left ;
    IterativePreOrder right;
    int key;

    IterativePreOrder(int k) {
        key = k;
    }
}

class IterativePreMain {
    public static void preOrder(IterativePreOrder root) {
        Stack st=new Stack();
        st.add(root);
        while(!st.isEmpty()){
            IterativePreOrder curr= (IterativePreOrder) st.pop();
            System.out.print(curr.key+" ");
            if(curr.right!=null){
                st.add(curr.right);
            }
            if(curr.left!=null){
                st.add(curr.left);
            }
        }

    }

    public static void main(String[] args) {
        IterativePreOrder root=new IterativePreOrder(10);
        root.left=new IterativePreOrder(20);
        root.right=new IterativePreOrder(30);
        root.left.left=new IterativePreOrder(40);
        root.left.right=new IterativePreOrder(50);
        preOrder(root);
    }
}

