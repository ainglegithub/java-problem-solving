package leetcode.easy;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    //()[]{}

    public static void main(String[] args) {

        String str = "()[]{}(({}))";
        Boolean result = validParentheses(str);
        System.out.println("ValidParentheses: " + result);
    }

    private static Boolean validParentheses(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
