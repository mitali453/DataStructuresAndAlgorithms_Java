/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:16 PM
 */
package Stack;

/*
 * It is the most imp application of stack.
 * =============================================
 *
 * STOCK SPAN is defined as the number of consecutive days prior to the current day
 * when the price of the stock was less than equal to the price at cureent day.
 *
 * Stock span m dekhte h .Assume hmpr ek array h to hm phle element pr hunge to stock
 * span hmesha 1 hoga bcz usse aaage ek b elemnt ni h fir, jb hm dusre ele pr gye to hm
 * check krte h ki usse le k, usse aage jhn tk k element usse chote ya uske brabr ho whn tk
 * unhe add kr lete h. Agr age k bde ho to wahin firse  intilise 1 kr dete h
 *
 * EX. [100,60,70,65,80,85]
 * stock span for 100: 1
 * stock span for 60: 1, [kyunki usse aage uska consecutive koi chota ya brabr ni h]
 * stock span for 70: 2, [1 chota h 60] + ek wo khud(70)
 * stock span for 65: 1,[70 bda h i.e. uska consecutive bda h]
 * stock span for 80: 4, [60,70,65,80 ]
 * stock span for 85: 5, [60,70,65,80,85]
 * */

import java.util.Stack;

public class StockSpanProblem {
    public static void printSpan(int arr[],int n){
        Stack<Integer> s=new Stack<>();
        s.push(0);
        System.out.print(1+" ");
        for(int i=1;i<n;i++){
            while(s.isEmpty()==false && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            int span=s.isEmpty() ? i+1 : i-s.peek();
            System.out.print(span + " ");
            s.push(i);
        }
        System.out.println();
    }
}
class StockSpanMain{
    public static void main(String[] args) {
        StockSpanProblem sp=new StockSpanProblem();
        int[] arr=new int[]{18,12,19,14,11,16,20};
        System.out.print("Stock span's are: ");
        sp.printSpan(arr,arr.length);
    }

}

