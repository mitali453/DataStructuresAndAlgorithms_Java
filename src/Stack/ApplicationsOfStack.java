/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:02 PM
 */
package Stack;

// Very imp application : Stock span problem


/*
 * Applications of Stack are:
 * ===============================
 *
 * 1. Function calls: The function which is the last will be resolved first.
 *
 * 2. Balanced Parenthesis: Put the opening parenthesis in the stack and pop when the top and
 * closing parenthesis is same combination .If stack become empty , then it is balanced.
 *
 * 3.Reversing items : firstly put the items one by  one in the stack,the item which is
 * last recently entered will be popped first. By this , stack will be reversed.
 *
 * 4. Infix to postfix/prefix
 *
 * 5. Evaluation of postfix/prefix
 *
 * 6. Stock Span Problem
 *
 * 7. Undo/Redo or Backward/Forward : The operation which is last recent will be undo first.
 * (works as ctrl-z)
 *
 * */

import java.util.Stack;

public class ApplicationsOfStack {
    boolean CheckParantheis(String st) {
        Stack s = new Stack();
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == '{' || st.charAt(i) == '(' || st.charAt(i) == '[') {
                s.add(st.charAt(i));
            } else {
                if (s.empty() == true) {
                    return false;
                } else if (matching((Character) s.peek(), st.charAt(i)) == false) {
                    return false;
                } else {
                    s.pop();
                }
            }
        }
        return s.isEmpty() == true;
    }

    private boolean matching(char a, char b) {
        return (
                (a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}')
        );
    }

}

class Main {
    public static void main(String[] args) {
        ApplicationsOfStack ap = new ApplicationsOfStack();
        String str = "{{[]}}";
        if (ap.CheckParantheis(str)) {
            System.out.println("Balanced");
        } else {
            System.out.println("UnBalanced");
        }

    }
}





