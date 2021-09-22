/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 9/20/2021
 *  Time: 7:30 PM
 */
package Searching;

public class CountOccur {
    public int firstOccur(int[] arr,int x){
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
                    return mid;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public int lastOccur(int[] arr, int x){
        int low= 0;
        int high= arr.length-1;
        while(low<=high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                if (mid==arr.length-1 || arr[mid]!=arr[mid+1] ){

                    return mid;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }




    public static void main(String[] args) {
        CountOccur c= new CountOccur();
        int[] arr= {10,20,30,30,30,50,50,60};
        int x=50;
        int low= 0;
        int high= arr.length-1;
        int count= c.lastOccur(arr,x) - c.firstOccur(arr,x);
        System.out.println("Count : "+ (count+1));


    }
}
