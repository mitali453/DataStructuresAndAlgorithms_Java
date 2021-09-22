/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 9/20/2021
 *  Time: 11:04 PM
 */
package Searching;

import java.util.Collections;
import java.util.Scanner;


public class ArrayRotate {
    public static void reverse(int[] arr, int low, int high){
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        for (int a: arr) {
            System.out.print(a+" ");
        }

    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.print("Original Array ");
        for (int a: arr) {
            System.out.print(a+" ");
        }
        System.out.println();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array rotation: ");
        int k=sc.nextInt();
        reverse(arr,0,k-1);
        System.out.println();
        reverse(arr,k,arr.length-1);
        System.out.println();
        System.out.println("Rotated array: ");
        reverse(arr,0,arr.length-1);







    }


}
