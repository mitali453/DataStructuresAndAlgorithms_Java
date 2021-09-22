/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 9/22/2021
 *  Time: 12:14 AM
 */
package Searching;
//Only for sorted Array:

//We can call it a two pointer approach.
//In this, we have to find a the pair which is equals to the sum given in the ex.

public class PairWithGivenSum {
    public static boolean pair(int[] arr, int x){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]+arr[right]==x){
                System.out.println(arr[left]+" "+arr[right]);
                return true;
            }
            else if(arr[left]+arr[right]>x){
                right--;
            }
            else{
                left++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={3,8,13,18};
        boolean res= pair(arr,26);
        if(res==true){
            System.out.println("Yes, we have a pair");
        }
        else{
            System.out.println("No pair found");
        }
    }
}
