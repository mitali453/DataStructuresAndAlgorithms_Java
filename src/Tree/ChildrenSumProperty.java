/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:23 PM
 */
package Tree;

public class ChildrenSumProperty {
    int key;
    ChildrenSumProperty left;
    ChildrenSumProperty right;
    public ChildrenSumProperty(int key) {
        this.key = key;
    }
}
class ChildrenSumMain {
    public static boolean childrenSumProperty(ChildrenSumProperty root){
        if(root==null){
            return true;
        }
        if(root.left==null && root.right==null){
            return true;
        }
        int sum=0;
        if(root.left!=null){sum+=root.left.key;}
        if(root.right!=null){sum+=root.right.key;}
        return (root.key==sum && childrenSumProperty(root.left)
                && childrenSumProperty(root.right));
    }



    public static void main(String[] args) {
        ChildrenSumProperty root = new ChildrenSumProperty(20);
        root.left = new ChildrenSumProperty(8);
        root.right = new ChildrenSumProperty(12);
        root.right.left = new ChildrenSumProperty(3);
        root.right.right = new ChildrenSumProperty(5);
        boolean result = childrenSumProperty(root);
        if(result==true){
            System.out.println("Yes, It follows children sum property");
        }
        else{
            System.out.println("No,It does not");
        }
    }
}

