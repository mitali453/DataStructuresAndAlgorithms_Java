/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/12/2021
 *  Time: 1:17 PM
 */
package Tree;

public class CountNodesInComplete {
    CountNodesInComplete left;
    CountNodesInComplete right;
    int key;
    CountNodesInComplete(int k){
        key = k;
    }
}
class CompleteMain{
    public static double count(CountNodesInComplete root){
        int lh=0;
        int rh=0;
        CountNodesInComplete curr=root;
        while(curr!=null){
            lh++;
            curr=curr.left;
        }
        while(curr!=null){
            rh++;
            curr=curr.right;
        }
        if(lh==rh){
            return Math.pow(2,lh)-1;
        }
        return 1+count(root.left)+count(root.right);
    }

    public static void main(String[] args) {
        CountNodesInComplete root = new CountNodesInComplete(10);
        root.left = new CountNodesInComplete(20);
        root.left.left = new CountNodesInComplete(40);
        root.left.right = new CountNodesInComplete(50);
        root.left.right.left=new CountNodesInComplete(2);
        root.right = new CountNodesInComplete(30);
        root.right.left=new CountNodesInComplete(60);
        root.right.right = new CountNodesInComplete(70);
        root.left.left.left=new CountNodesInComplete(80);
        root.left.left.right=new CountNodesInComplete(90);
        root.left.right.left=new CountNodesInComplete(100);
        root.left.right.right=new CountNodesInComplete(110);
        root.right.left.left=new CountNodesInComplete(120);
        double res=count(root);
        System.out.println("Count is: "+res);

    }
}
