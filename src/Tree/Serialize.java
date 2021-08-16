/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/12/2021
 *  Time: 1:33 PM
 */
package Tree;

//Serialize the Tree meaning is to convert the tree  in  the form of array or string.

import java.util.ArrayList;

public class Serialize {
    Serialize left;
    Serialize right;
    int key;
    Serialize(int k){
        key=k;
    }
}
class SMain{
    public static ArrayList serialize(Serialize root, ArrayList arr){
        if(root==null){
            arr.add(-1);
            return arr;
        }
        arr.add(root.key);
        serialize(root.left,arr);
        serialize(root.right,arr);
        return arr;
    }
    public static void print(Serialize root, ArrayList arr){
        ArrayList a=serialize(root,arr);
        for (Object k:a) {
            System.out.print(k+" ");
        }
    }

    public static void main(String[] args) {
        ArrayList arr=new ArrayList();
        Serialize root= new Serialize(10);
        root.left =new Serialize(20);
        print(root,arr);
    }
}
