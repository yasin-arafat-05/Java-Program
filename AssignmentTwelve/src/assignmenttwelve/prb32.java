/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
Write a Java program to find the longest Palindromic Substring within a string.
Sample Output:The given string is: thequickbrownfoxxofnworbquickthe
The longest palindrome substring in the giv
en string is; brownfoxxofnworb
The length of the palindromic substring is: 16
 */
public class prb32 {
    public static void main(String[] args) {
        String inputString = "thequickbrownfoxxofnworbquickthe";

        // Find the longest palindromic substring
        String longestPalindrome = findLongestPalindrome(inputString);

        // Print the original string, longest palindrome, and its length
        System.out.println("The given string is: " + inputString);
        System.out.println("The longest palindrome substring in the given string is: " + longestPalindrome);
        System.out.println("The length of the palindromic substring is: " + longestPalindrome.length());
    }

    private static String findLongestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
