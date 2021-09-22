/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 9/20/2021
 *  Time: 7:54 PM
 */
package Searching;

public class SquareRoot {
    public static int squareRoot(int x) {
        int low = 1;
        int high = x;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midSq = mid * mid;
            if (midSq == x) {
                return mid;
            } else if (midSq > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 100;
        System.out.println("SquareRoot :" + squareRoot(x));
    }
}
