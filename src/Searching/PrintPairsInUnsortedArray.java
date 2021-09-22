/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 9/22/2021
 *  Time: 12:35 AM
 */
package Searching;

//Only for Unsorted array.

import java.util.HashSet;

public class PrintPairsInUnsortedArray {
    public static void printSums(int[] arr, int x){
        HashSet h = new HashSet();
        for(int i=0; i<arr.length;++i){
            int temp=x-arr[i];
            if(h.contains(temp)){
                System.out.println("pair: "+ arr[i]+" , " + temp);
                return;
            }
            h.add(arr[i]);
        }
    }
    public static void main(String[] args) {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int n = 46;
        printSums(A, n);

    }
}
