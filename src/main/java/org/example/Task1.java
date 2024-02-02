
/**
 * Task 1:
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * Input: x = 121 Output: true
 * Input: x = 10 Output: false

 *  Requirements:
 -determine if x is a palindrome without making it a string
 -managing special cases such as handle cases where x is a negative number or ends with zero

 *  Constraints:
 -Aim for the most efficient algorithm

 *  Write down estimation after reading the task:
 -20min from the point of setup to commit

 *  Actually measure how much time you’ve spent
 -30min as setup took long
 **/

package org.example;
public class Task1 {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedHalf = 0;
        while (x > revertedHalf) {
            revertedHalf = revertedHalf * 10 + x % 10;
            x /= 10;
        }

        return x == revertedHalf || x == revertedHalf / 10;
    }

    public static void main(String[] args) {
        int x1 = 121;
        System.out.println(isPalindrome(x1));   // true

        int x2 = 10;
        System.out.println(isPalindrome(x2));   // false
    }
}
