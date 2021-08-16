/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:20 PM
 */
package Stack.ExtraQuestion;

import java.util.Scanner;
import java.util.Stack;

public class PreviousGreaterElement {
    void PreviousGreater(int arr[], int n){
        Stack s=new Stack();
        s.push(arr[0]);
        System.out.print(-1 +" ");
        for (int i = 1; i <arr.length ; i++) {
            while(s.isEmpty()==false && (int) s.peek()<=arr[i]){
                s.pop();
            }
            int Greater= s.isEmpty()?-1: (int) s.peek();
            System.out.print(Greater+" ");
            s.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        PreviousGreaterElement p= new PreviousGreaterElement();
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the array size you want");
        int length=sc.nextInt();
        int[] arr= new int[length];
        System.out.println("enter the array elements one by one");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Previous Greater elements: ");
        p.PreviousGreater(arr,arr.length);
    }
}
