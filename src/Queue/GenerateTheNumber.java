/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 9/14/2021
 *  Time: 11:20 PM
 */
package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class GenerateTheNumber {

    //Here we generate the number which contain 5 and 6 only in all the digits in ascending order.
    //You can take any of the number;

    public static void main(String[] args) {
        Queue q= new ArrayDeque<>();
        q.add("5");
        q.add("6");
        Scanner sc= new Scanner(System.in);
        System.out.println("Input the size n to where you want the generated number");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            String curr= (String) q.poll();
            System.out.print(curr +" ");
            q.add(curr+"5");
            q.add(curr+"6");

        }

    }
}
