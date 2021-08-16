/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:23 PM
 */
package Tree;

public class DiameterOfTree {
    DiameterOfTree left;
    DiameterOfTree right;
    int key;

    DiameterOfTree(int k) {
        key = k;
    }
}

class DiameterMain {
    static int dia= 0;
    public static int diameter(DiameterOfTree root){
        if(root==null){
            return 0;
        }

        int ls=diameter(root.left);
        int rs=diameter(root.right);
        dia = Math.max(dia,1+ls+rs);
        //System.out.println(dia);
        return dia;
    }
    public static void main(String[] args) {
        DiameterOfTree root = new DiameterOfTree(10);
        root.left = new DiameterOfTree(20);
        root.left.left = new DiameterOfTree(40);
        root.left.right = new DiameterOfTree(50);
        root.right = new DiameterOfTree(30);
        root.right.right = new DiameterOfTree(70);
        root.right.right.right = new DiameterOfTree(80);
        System.out.println("Diameter of tree: "+ diameter(root));

    }
}

