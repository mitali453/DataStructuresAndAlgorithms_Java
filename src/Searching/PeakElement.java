/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 9/21/2021
 *  Time: 12:30 AM
 */
package Searching;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr= {10, 20, 15,5, 23, 90,  67};
        int n= arr.length;
        int low = 0, high = n - 1;

        while(low <= high)

        {

            int mid = (low + high) / 2;

            if((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])){
                System.out.println(arr[mid]);
                return;}

            if(mid > 0 && arr[mid - 1] >= arr[mid]){
                high = mid -1;}
            else
                low = mid + 1;
        }

        System.out.println(-1);
        return;
    }
}
