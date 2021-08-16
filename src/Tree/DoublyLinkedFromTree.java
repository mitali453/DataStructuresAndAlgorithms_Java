/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:24 PM
 */
package Tree;

class DoublyLinkedListFromTree {
    int key;
    DoublyLinkedListFromTree left;
    DoublyLinkedListFromTree right;
    public DoublyLinkedListFromTree(int key) {
        this.key = key;
    }
}

class MainDoublyFromTree{
    public static DoublyLinkedListFromTree prev=null;
    public static DoublyLinkedListFromTree makeDoublyFromTree(DoublyLinkedListFromTree root){
        if(root==null){
            return root;
        }
        DoublyLinkedListFromTree head=makeDoublyFromTree(root.left);
        if(prev==null){
            head=root;
        }
        else{
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        makeDoublyFromTree(root.right);
        return head;
    }
    public static void println(DoublyLinkedListFromTree head){
        DoublyLinkedListFromTree curr=head;
        while(curr!=null){
            System.out.print(curr.key+" ");
            curr=curr.right;

        }

    }

    public static void main(String[] args) {
        DoublyLinkedListFromTree root= new DoublyLinkedListFromTree(10);
        root.left = new DoublyLinkedListFromTree(8);
        root.right = new DoublyLinkedListFromTree(12);
        root.right.left = new DoublyLinkedListFromTree(3);
        root.right.right = new DoublyLinkedListFromTree(5);
        DoublyLinkedListFromTree head= makeDoublyFromTree(root);
        println(head);
    }

}
