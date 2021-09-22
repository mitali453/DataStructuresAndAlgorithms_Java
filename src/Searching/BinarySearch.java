/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 9/20/2021
 *  Time: 6:57 PM
 */
package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {10,20,30,40,50,60};
        int x=50;
        int low= 0;
        int high= arr.length-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid]==x){
                System.out.println(mid);
                return ;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("-1");
        return ;
    }
}
