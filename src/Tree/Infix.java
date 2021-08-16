/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:26 PM
 */
package Tree;

public class Infix {
    int key;
    Infix left;
    Infix right;
    Infix(int k){
        key=k;
    }
}

class MainInfix{
    static void print(Infix root){
        if(root!=null) {
            print(root.left);
            System.out.print(root.key+" ");
            System.out.println();
            print(root.right);
        }
    }

    public static void main(String[] args) {
        Infix root=new Infix(10);
        root.left=new Infix(20);
        root.right=new Infix(30);
        root.left.left=new Infix(40);
        print(root);
    }

}


