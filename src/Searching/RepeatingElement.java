/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 9/22/2021
 *  Time: 7:19 PM
 */
package Searching;

public class RepeatingElement {
    public static int findRepeating(int[] arr, int n){
        int slow=arr[0];
        int fast= arr[0];
        do {
            slow=arr[slow];
            fast= arr[arr[fast]];
        }while(slow!=fast);

        slow=arr[0];
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        return slow;



    }
    public static void main(String[] args) {
        int[] arr= {1,2,2,4,6,5,7,3};
        System.out.println("element is: "+ findRepeating(arr,arr.length-1));
    }
}
