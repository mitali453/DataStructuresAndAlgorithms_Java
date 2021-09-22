/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 9/21/2021
 *  Time: 12:17 AM
 */
package Searching;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr= {10,20,30,40,1,2,7};
        int x=30;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid]==x){
                System.out.println(mid);
                return;
            }
            else if (arr[low]<arr[mid]){
                if(x>arr[low]  && x<arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(x>arr[mid] && x<=arr[high]){
                    low=mid+1;
                }
                high=mid-1;
            }

        }


    }
}
