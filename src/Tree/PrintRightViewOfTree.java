/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:29 PM
 */
package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintRightViewOfTree {
    int key;
    PrintRightViewOfTree left;
    PrintRightViewOfTree right;
    public PrintRightViewOfTree(int key) {
        this.key = key;
    }
}

class RightViewMain{
    public static void printRightViewOfTree(PrintRightViewOfTree root){
        if(root==null){
            return;
        }
        Queue q= new LinkedList();
        q.add(root);
        System.out.print(root.key+" ");
        while(q.isEmpty()==false){
            int size= q.size();
            for(int i=0;i<size;i++ ){
                PrintRightViewOfTree curr = (PrintRightViewOfTree) q.poll();

                if(i!=0){
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
        PrintRightViewOfTree root = new PrintRightViewOfTree(10);
        root.left = new PrintRightViewOfTree(20);
        root.left.left = new PrintRightViewOfTree(40);
        root.left.right = new PrintRightViewOfTree(50);
        root.right = new PrintRightViewOfTree(30);
        root.right.right = new PrintRightViewOfTree(70);
        root.right.right.left = new PrintRightViewOfTree(80);
        printRightViewOfTree(root);
    }

}

