/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:31 PM
 */
package Tree;

public class TreeFromInOrderAndPreOrder {
    int key;
    TreeFromInOrderAndPreOrder left;
    TreeFromInOrderAndPreOrder right;

    TreeFromInOrderAndPreOrder(int k) {
        key = k;
    }
}
class ItsMain{
    static int preIndex=0;
    public static TreeFromInOrderAndPreOrder treeFromInOrderPostOrder(int[] in, int[] pre, int is, int ie ){
        if(is>ie){
            return null;
        }
        int index=is;
        TreeFromInOrderAndPreOrder root= new TreeFromInOrderAndPreOrder(pre[preIndex++]);
        for (int i = is; i <=ie; i++) {
            if(in[i]==root.key){
                index=i;
                break;
            }
        }
        root.left=treeFromInOrderPostOrder(in,pre,is,index-1);
        root.right=treeFromInOrderPostOrder(in,pre,index+1,ie);
        return root;
    }
    public static void inOrder(TreeFromInOrderAndPreOrder root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.key+" " );
            inOrder(root.right);
        }
    }
    public static void main(String[] args) {
        int[] in=new int[]{20,10,40,30,50};
        int[] pre=new int[]{10,20,30,40,50};
        int is=0;
        int ie=pre.length;
        TreeFromInOrderAndPreOrder root=treeFromInOrderPostOrder(in,pre,0,ie-1);
        inOrder(root);
    }
}

