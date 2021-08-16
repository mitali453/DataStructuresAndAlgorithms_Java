/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:19 PM
 */
package Stack.ExtraQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElement {
    public ArrayList<Integer> NextGreater(int[] arr, int n) {
        Stack s = new Stack();
        ArrayList<Integer> v=new ArrayList();
        s.push(arr[n - 1]);
        v.add(-1);
        for (int i = n - 2; i >= 0; i--) {
            while (s.isEmpty() == false && (int) s.peek() <= arr[i]) {
                s.pop();
            }
            int Greater = s.isEmpty() ? -1 : (int) s.peek();
            v.add(Greater);
            s.push(arr[i]);
        }
        Collections.reverse(v);
        return v;
    }

    public static void main(String[] args) {
        NextGreaterElement p = new NextGreaterElement();
        int[] arr=new int[]{5,15,10,8,6,12,9,18};
        System.out.print("Next Greater elements: ");
        for(int i: p.NextGreater(arr, arr.length)){
            System.out.print(i+ " ");
        }

    }
}
