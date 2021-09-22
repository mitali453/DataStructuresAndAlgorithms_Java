/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 9/22/2021
 *  Time: 12:59 AM
 */
package Searching;

// Majority means if the occurrence of some element is greater than the (size/2) is known as majority.
//It returns the one of the index of the majority element.

public class Majority {
    public static void main(String[] args) {
        int[] arr= {8,8,6,6,6,4,6};
        int res= 0;
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[res]==arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                res=i;
                count=1;
            }
        }
        count=0;
        for(int i=0;  i< arr.length;i++){
            if(arr[res]==arr[i]){
                count++;
            }
        }
        if(count<=(arr.length/2)){
            res=-1;
            return;

        }
        System.out.println("index is: "+ res + " and majority element is: "+arr[res ]  );
        return ;
    }
}
