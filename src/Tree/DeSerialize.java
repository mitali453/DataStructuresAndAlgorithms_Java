/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/12/2021
 *  Time: 1:44 PM
 */
package Tree;

import java.util.ArrayList;

public class DeSerialize {
    DeSerialize left;
    DeSerialize right;
    int key;
    DeSerialize(int k){
        key=k;
    }
}
class DeSerializeMain{
    static int index=0;
    public static DeSerialize deSerialize(ArrayList arr){
        if(arr.size()==index){
            return null;
        }
        int val= (int) arr.get(index);
        index++;
        if(val==-1){
            return null;
        }
        DeSerialize root=new DeSerialize(val);
        root.left=deSerialize(arr);
        root.right=deSerialize(arr);
        return root;

    }
    public static void print(DeSerialize root){
        if(root!=null){
            System.out.print(root.key+" ");
            print(root.left);
            print(root.right);

        }

    }
    public static void main(String[] args) {
        ArrayList arr=new ArrayList();
        arr.add(10);
        arr.add(20);
        arr.add(-1);
        arr.add(-1);
        arr.add(-1);
        DeSerialize root=deSerialize(arr);
        print(root);

    }
}
