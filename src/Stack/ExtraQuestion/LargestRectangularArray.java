/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:18 PM
 */
package Stack.ExtraQuestion;

import java.util.Stack;

class LargestRectangularArea {
    public static int largestArea(int[] arr , int n){
        Stack s=new Stack();
        int curr;
        int res=0;
        int tp;
        for (int i = 0; i <n ; i++) {
            while (s.empty()==false && arr[(int) s.peek()]>=arr[i]){
                tp= (int) s.pop();
                curr=arr[tp] * (s.isEmpty() ? i : i-(int)s.peek()-1);
                res= Math.max(res,curr);
            }
            s.push(i);
        }
        while(s.isEmpty()==false){
            tp= (int) s.pop();
            curr=arr[tp] * ( s.isEmpty()? n : n-(int)s.peek()-1 );
            res=Math.max(res,curr);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{6,2,5,4,1,5,6};
        int result=largestArea(arr,7);
        System.out.println("Maximum area: "+ result);
    }
}



