/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:26 PM
 */
package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    int key;
    LevelOrderTraversal left;
    LevelOrderTraversal right;
    public LevelOrderTraversal(int key) {
        this.key = key;
    }
}

class MainOrderTraversal{
    public static void printLevelOrder(LevelOrderTraversal root){
        if(root==null){
            return;
        }
        Queue q =new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            LevelOrderTraversal curr= (LevelOrderTraversal) q.poll();
            System.out.print(curr.key+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
    }

    public static void printLevelOneByOne1(LevelOrderTraversal root){
        if(root==null){
            return;
        }
        Queue q=new LinkedList();
        q.add(root);
        LevelOrderTraversal max=root;
        q.add(null);
        while(q.size()>1){
            LevelOrderTraversal curr= (LevelOrderTraversal) q.poll();
            if(curr==null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.key+" ");
            if(curr.left!=null){
                q.add(curr.left);
                if(curr.left.key>max.key){
                    max=curr.left;

                }
            }
            if(curr.right!=null){
                q.add(curr.right);
                if(curr.right.key>max.key){
                    max=curr.right;
                }
            }
        }
        System.out.println("maximum no. is: "+max.key);
    }
    public static void printLevelOneByOne2(LevelOrderTraversal root){
        if(root==null){
            return;
        }
        Queue q=new LinkedList();
        q.add(root);
        while (q.isEmpty()==false){
            int count=q.size();
            for(int i=0;i<count;i++){
                LevelOrderTraversal curr = (LevelOrderTraversal) q.poll();
                System.out.print(curr.key+" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            System.out.println();
        }
    }

    static int size(LevelOrderTraversal root){
        if(root==null){
            return 0;
        }
        return 1+(size(root.left)+size(root.right));
    }

    public static void main(String[] args) {
        LevelOrderTraversal root=new LevelOrderTraversal(10);
        root.left=new LevelOrderTraversal(20) ;
        root.left.left=new LevelOrderTraversal(40);
        root.left.right=new LevelOrderTraversal(50);
        root.right=new LevelOrderTraversal(30);
        root.right.right=new LevelOrderTraversal(70);
        root.right.right.right=new LevelOrderTraversal(80);
        System.out.println("Print Level Order Traversal: ");
        printLevelOrder(root);
        System.out.println();
        System.out.println("Print Level Order Traversal One By One ( Method1 ): ");
        printLevelOneByOne1(root);
        System.out.println();
        System.out.println("Print Level Order Traversal One By One ( Method2 ): ");
        printLevelOneByOne2(root);
        System.out.println("Size: "+ size(root));
    }
}
