package StackAndQueue;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stk.push(ch); // opening bracket
            } else {
                if (stk.isEmpty()) {
                    return false; // closing bracket has nothing to match
                }

                char top = stk.pop(); // get last opening bracket

                // check for mismatch
                if ((ch == ')' && top != '(') ||
                        (ch == ']' && top != '[') ||
                        (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stk.isEmpty(); // check if all brackets matched
    }

    public static void main(String[] args) {
        String input = "([{}])";
        System.out.println("Is valid: " + isValid(input));
    }
}
