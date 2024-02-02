
/**
 * Task 2:
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:Open brackets must be closed by the same type of brackets.Open brackets must be closed in the correct order.Every close bracket has a corresponding open bracket of the same type.
 * Input: s = "()[]{}" Output: true
 * Input: s = "(]" Output: false

 *  Requirements:
 - an empty string, should be false
 - an odd string should be false
 - a bracket that is not followed by the same opening bracket is false
 - a string with characters other than '(', ')', '{', '}', '[' and ']', is false

 *   Constraints:
 - Aim for the most efficient algorithm

 *   Write down estimation after reading the task:
 -25min from the point of setup to commit

 *   Actually measure how much time you’ve spent:
 -20min as it was already setup for task1
 **/

package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class Task2 {
    public static boolean isValid(String s) {
        if (s.isEmpty() || s.length() % 2 != 0) return false;

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;
                default:
                    return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));  // true
        System.out.println(isValid("(]"));  // false
    }
}
