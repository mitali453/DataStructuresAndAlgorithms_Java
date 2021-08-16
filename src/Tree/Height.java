/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:24 PM
 */
package Tree;

import java.util.Scanner;

class Height {
    int key;
    Height left;
    Height right;
    Height(int k){
        key=k;
    }
}

class MainHeight{
    static int height(Height root){
        if(root==null){
            return 0;
        }
        else{
            return Math.max(height(root.left),height(root.right))+1;
        }
    }
    static void KHeight(Height root, int k){
        if(root==null){
            return;
        }
        else if(k==0){
            System.out.print(root.key+" ");
        }
        else{
            KHeight(root.left,k-1);
            KHeight(root.right,k-1);
        }
    }

    public static void main(String[] args) {
        Height root=new Height(10);
        root.left=new Height(20);
        root.left.left=new Height(40);
        root.left.right=new Height(50);
        root.right=new Height(30);
        root.right.right=new Height(70);
        root.right.right.right=new Height(80);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        KHeight(root,k);
    }
}


