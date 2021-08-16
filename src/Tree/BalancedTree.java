/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:21 PM
 */
package Tree;

public class BalancedTree {
    int key;
    BalancedTree left;
    BalancedTree right;
    public BalancedTree(int key){
        this.key = key;
    }
}
class BalancedTreeMain{
    public static int balancedTree(BalancedTree root){
        if(root==null){
            return 0;
        }
        int ls=balancedTree(root.left);
        if(ls==-1){
            return -1;
        }
        int rs=balancedTree(root.right);
        if (rs==-1){
            return -1;
        }
        if(Math.abs(ls-rs)>1){
            return -1;
        }
        else{
            return Math.max(ls,rs)+1;
        }
    }

    public static void main(String[] args) {
        BalancedTree root = new BalancedTree(8);
        root.left = new BalancedTree(12);
        root.left.left=new BalancedTree(13);
        root.right = new BalancedTree(15);
        root.right.right = new BalancedTree(16);
        root.right.right.right = new BalancedTree(5);
        int a = balancedTree(root);
        if(a==-1){
            System.out.println("Not Balanced");
        }
        else{
            System.out.println("Balanced");
        }
    }
}

