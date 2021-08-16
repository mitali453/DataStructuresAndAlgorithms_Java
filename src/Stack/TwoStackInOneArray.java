/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:17 PM
 */
package Stack;

public class TwoStackInOneArray {
    int cap;
    int top1;
    int arr[];
    int top2;
    TwoStackInOneArray(int n){
        top1=-1;
        cap=n;
        top2=cap;
        arr=new int[n];
    }
    void push1(int ele){
        if(top1<top2-1){
            top1++;
            arr[top1]=ele;
        }
        else{
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }
    void push2(int ele){
        if(top1<top2-1){
            top2--;
            arr[top2]=ele;
        }
        else{
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }
    int pop1(){
        if(top1>=0){
            int x=arr[top1];
            top1--;
            return x;

        }
        else{
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }
    int pop2(){
        if(top2<cap){
            int x=arr[top2];
            top2++;
            return x;
        }
        else{
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }
    void print(){
        for (int a:arr) {
            System.out.print(a+" ");

        }
        System.out.println();
    }
}
class MainTwoStackIn1Array{
    public static void main(String[] args) {
        TwoStackInOneArray ts=new TwoStackInOneArray(6);
        ts.push1(10);
        ts.push2(1);
        ts.push1(20);
        ts.push2(2);
        ts.push1(30);
        ts.push2(3);
        ts.print();
        System.out.println("Popped from stack1 "+ts.pop1());
        System.out.println("Popped from stack2 "+ts.pop2());
        ts.push1(40);
        ts.push1(50);
        ts.push1(60);
        ts.print();
        System.out.println("Popped from stack1 "+ts.pop1());
    }
}

