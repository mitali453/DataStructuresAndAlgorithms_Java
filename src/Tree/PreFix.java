/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:28 PM
 */
package Tree;

class Prefix {
    int key ;
    Prefix left;
    Prefix right;
    Prefix(int k){
        key=k;
    }
}

class MainPrefix{
    static void print(Prefix root){
        if(root!=null) {
            System.out.print(root.key+" ");
            print(root.left);
            print(root.right);
        }
    }

    public static void main(String[] args) {
        Prefix root=new Prefix(10);
        root.left=new Prefix(20);
        root.right=new Prefix(30);
        root.right.left=new Prefix(40);
        root.right.right=new Prefix(50);
        print(root);
    }

}
