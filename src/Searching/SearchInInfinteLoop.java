/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 9/20/2021
 *  Time: 10:26 PM
 */
package Searching;

public class SearchInInfinteLoop {
    public static int search(int[] arr, int x){
        if(arr[0]==x){return 0;}
        int i=1;
        while(arr[i]<x){
            i=i*2;

        }
        if(arr[i]==x){return x;}
        return binarySearch(arr,i/2+1,i-1 ,x );
    }

    private static int binarySearch(int[] arr, int i, int i1 , int x) {
        int low= i;
        int high= i1;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr={10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100,105,110,120,125,130,140};
        int x= 35;
        int position=search(arr,x);
        System.out.println(position);
    }
}
