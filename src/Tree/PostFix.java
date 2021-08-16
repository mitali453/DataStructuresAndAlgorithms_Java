/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:28 PM
 */
package Tree;

class Postfix {
    int key;
    Postfix left;
    Postfix right;
    Postfix(int k){
        key=k;
    }
}

class MainPostInfix{
    static void print(Postfix root){
        if(root!=null) {
            print(root.left);
            print(root.right);
            System.out.print(root.key+" ");
        }
    }

    public static void main(String[] args) {
        Postfix root=new Postfix(10);
        root.left=new Postfix(20);
        root.right=new Postfix(30);
        root.right.left=new Postfix(40);
        root.right.right=new Postfix(50);
        print(root);
    }
}

