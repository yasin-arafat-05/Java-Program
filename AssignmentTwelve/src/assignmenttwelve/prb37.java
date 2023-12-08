/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
 Write a Java program to find the length of the longest substring of a given string without repeating characters.
Sample Output:Input String : pickoutthelongestsubstring
The longest substring : [u, b, s, t, r, i, n, g]
The longest Substring Length : 8
 */

import java.util.HashSet;
import java.util.Set;

public class prb37 {
    public static void main(String[] args) {
        String inputString = "pickoutthelongestsubstring";

        // Find and print the length of the longest substring without repeating characters
        System.out.println("Input String: " + inputString);
        int longestLength = findLongestSubstringLength(inputString);
        System.out.println("The longest substring length: " + longestLength);
    }

    private static int findLongestSubstringLength(String s) {
        int n = s.length();
        int maxLength = 0;
        int i = 0, j = 0;

        Set<Character> charSet = new HashSet<>();

        while (j < n) {
            // If the character is not in the set, add it and update the maximum length
            if (!charSet.contains(s.charAt(j))) {
                charSet.add(s.charAt(j));
                maxLength = Math.max(maxLength, j - i + 1);
                j++;
            } else {
                // If the character is in the set, remove the leftmost character and move the left pointer
                charSet.remove(s.charAt(i));
                i++;
            }
}
