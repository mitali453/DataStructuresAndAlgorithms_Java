/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:29 PM
 */
package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLeftViewOfTree {
    int key;
    PrintLeftViewOfTree left;
    PrintLeftViewOfTree right;
    public PrintLeftViewOfTree(int key) {
        this.key = key;
    }
}
class LeftViewMain{
    public static void printLeftViewOfTree(PrintLeftViewOfTree root){
        if(root==null){
            return;
        }
        Queue q= new LinkedList();
        q.add(root);
        while(q.isEmpty()==false){
            int size= q.size();
            for(int i=0;i<size;i++ ){
                PrintLeftViewOfTree curr = (PrintLeftViewOfTree) q.poll();

                if(i==0){
                    System.out.print(curr.key+" ");
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }

    }

    public static void main(String[] args) {
        PrintLeftViewOfTree root = new PrintLeftViewOfTree(10);
        root.left = new PrintLeftViewOfTree(20);
        root.left.left = new PrintLeftViewOfTree(40);
        root.left.right = new PrintLeftViewOfTree(50);
        root.right = new PrintLeftViewOfTree(30);
        root.right.right = new PrintLeftViewOfTree(70);
        root.right.right.left = new PrintLeftViewOfTree(80);
        printLeftViewOfTree(root);
    }

}


