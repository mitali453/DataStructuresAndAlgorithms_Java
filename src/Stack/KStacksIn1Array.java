/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:03 PM
 */
package Stack;

public class KStacksIn1Array {
    int arr[];
    int next[];
    int top[];
    int cap;
    int k;
    int freeTop;
    KStacksIn1Array(int k1,int n){
        k=k1;
        cap=n;
        arr=new int[cap];
        next=new int[cap];
        top=new int[k];
        freeTop=0;
        for (int i = 0; i <k ; i++) {
            top[i]=-1;
        }
        for (int i = 0; i <cap-1 ; i++) {
            next[i]=i+1;
        }
        next[cap-1]=-1;
    }
    boolean isFull(){
        return (freeTop==-1);
    }
    boolean isEmpty(int sn){
        return (top[sn]==-1);
    }
    void push(int x,int sn){
        if (isFull()){
            System.out.println("stack overflow");
            return ;
        }
        int i=freeTop;
        freeTop=next[i];
        next[i]=top[sn];
        top[sn]=i;
        arr[i]=x;

    }
    int pop(int sn){
        if(isEmpty(sn)){
            System.out.println("Stack underflow");
            return Integer.MAX_VALUE;
        }
        int i=top[sn];
        top[sn]=next[i];
        next[i]=freeTop;
        freeTop=i;
        return arr[i];
    }
}
class KStackMain{
    public static void main(String[] args) {
        KStacksIn1Array k=new KStacksIn1Array(3,10);
        k.isEmpty(0);
        k.isEmpty(1);
        k.isEmpty(2);
        k.push(1,0);
        k.push(2,0);
        k.push(3,0);
        k.push(10,1);
        k.push(20,1);
        k.push(30,1);
        k.push(100,2);
        k.push(200,2);
        k.push(300,2);
        k.push(400,2);
        k.push(0,2);
        System.out.println("Popped 0: "+k.pop(0));
        System.out.println("Popped 2: "+k.pop(2));
        System.out.println("Popped 1: "+k.pop(1));


    }
}

