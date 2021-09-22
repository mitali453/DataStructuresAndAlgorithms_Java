/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 9/20/2021
 *  Time: 7:40 PM
 */
package Searching;


/*
* In this , we have an sorted array which contain only 0,1 .After the occurrence of 0 , occurrence of 1 come.
* ex: [0,0,0,1,1]
* ex:[0,1,1,1]
* We have to find the number of 1's in an array.
* We simply use the algorithm i.e. we have to find the first occurrence of 1 then subtract it from array.length.
* */

public class Count1 {
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
    public static void main(String[] args) {
        int[] arr= {0,0,0};
        int x=1;
        Count1 c= new Count1();
        int count=c.firstOccur(arr,x);
        if(count>0){
            int count1s= arr.length-count;
            System.out.println("Count of 1's is: "+ count1s);
        }
        else{
            System.out.println("1 Present: 0 ");
        }


    }
}
