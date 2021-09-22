/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 9/20/2021
 *  Time: 7:12 PM
 */
package Searching;

public class FirstOccur {
    public static void main(String[] args) {
        int[] arr= {10,20,30,30,30,50,50,60};
        int x=30;
        int low= 0;
        int high= arr.length-1;
        while(low<=high) {
            int mid = (low + high) / 2;
            if(arr[mid]>x){
                high= mid-1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                if(mid==0 || arr[mid-1]!=arr[mid]){
                    System.out.println(mid);
                    return;
                }
                else{
                    high=mid-1;
                }
            }
        }
        System.out.println("-1");
        return;
    }
}
