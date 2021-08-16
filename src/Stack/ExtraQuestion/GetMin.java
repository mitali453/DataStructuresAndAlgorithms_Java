/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:18 PM
 */
package Stack.ExtraQuestion;

import java.util.Stack;

public class GetMin {
    Stack s= new Stack();
    int min;
    void push(int x){

        if(s.isEmpty()){
            min=x;
            s.add(x);
        }
        else if(x<=min){
            s.add(x-min);
            min=x;
        }
        else{
            s.add(x);
        }
    }
    int pop(){
        int t= (int) s.pop();
        if (t<=0){
            int res=min;
            min=min-t;
            return res;
        }
        else{
            return t;
        }
    }
    int min(){
        return min;
    }
    int peek(){
        int t= (int) s.peek();
        if(t<=min){
            return min;
        }
        return t;
    }

    public static void main(String[] args) {
        GetMin st=new GetMin();
        st.push(4);
        st.push(5);
        st.push(8);
        st.push(1);

        System.out.println("Minimum from stack "+st.min());

    }
}

