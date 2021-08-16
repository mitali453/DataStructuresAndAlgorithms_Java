/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:22 PM
 */
package Tree;

//Firstly, Binary Tree can have atmost 2 child.


public class BinaryTree {
    int key;
    BinaryTree left;
    BinaryTree right;
    BinaryTree(int k){
        key=k;
    }
}

class MainBinaryTree{
    static void print(BinaryTree root){
        if(root!=null) {
            System.out.print(root.key+" ");
            print(root.left);
            System.out.println();
            print(root.right);
        }
    }

    static int size(BinaryTree root){
        if(root==null){
            return 0;
        }
        return 1+(size(root.left)+size(root.right));
    }


    public static void main(String[] args) {
        BinaryTree root=new BinaryTree(10);
        root.left=new BinaryTree(20);
        root.right=new BinaryTree(30);
        root.left.left=new BinaryTree(40);
        print(root);
        System.out.println("Size of a tree: "+size(root));
    }

}

