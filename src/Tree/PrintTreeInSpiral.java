/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:30 PM
 */
package Tree;

/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/2/2021
 *  Time: 2:50 PM
 */


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
class PrintTreeInSpiralOrder {
    PrintTreeInSpiralOrder left;
    PrintTreeInSpiralOrder right;
    int key;
    PrintTreeInSpiralOrder(int k){
        key=k;
    }
}

class MainTreeInSpiral{
    public static void printTreeInSpiral(PrintTreeInSpiralOrder root){
        if(root==null) {
            return;
        }
        Queue q= new LinkedList();
        Stack s= new Stack();
        boolean reverse=false;
        q.add(root);
        while(!q.isEmpty()){
            int count= q.size();
            for (int i = 0; i < count; i++) {
                PrintTreeInSpiralOrder curr= (PrintTreeInSpiralOrder) q.poll();
                if(reverse==true){
                    s.push(curr.key);
                }
                else{
                    System.out.print(curr.key+" ");
                }
                if(curr.left!=null){q.add(curr.left);}
                if(curr.right!=null){q.add(curr.right);}
            }
            if(reverse==true){
                while (s.isEmpty()==false){
                    System.out.print(s.pop()+" ");
                }
            }
            reverse=!reverse;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PrintTreeInSpiralOrder root = new PrintTreeInSpiralOrder(10);
        root.left = new PrintTreeInSpiralOrder(20);
        root.left.left = new PrintTreeInSpiralOrder(40);
        root.left.right = new PrintTreeInSpiralOrder(50);
        root.left.right.left=new PrintTreeInSpiralOrder(2);
        root.right = new PrintTreeInSpiralOrder(30);
        root.right.right = new PrintTreeInSpiralOrder(70);
        root.right.right.left = new PrintTreeInSpiralOrder(80);
        printTreeInSpiral(root);

    }
}
