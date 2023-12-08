/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
 Write a Java program to remove duplicate characters from a given string that appear in another given string.
Sample Output:The given string is: the quick brown fox
The given mask string is: queen

The new string is:
th ick brow fo
 */

import java.util.HashSet;
import java.util.Set;


public class prb41 {
      public static void main(String[] args) {
        String inputString = "the quick brown fox";
        String maskString = "queen";

        // Remove duplicates and print the new string
        System.out.println("The given string is: " + inputString);
        System.out.println("The given mask string is: " + maskString);
        String result = removeDuplicates(inputString, maskString);
        System.out.println("\nThe new string is:\n" + result);
    }

    private static String removeDuplicates(String s, String mask) {
        Set<Character> maskSet = new HashSet<>();
        Set<Character> charSet = new HashSet<>();
        
        // Populate the mask set with characters from the mask string
        for (char c : mask.toCharArray()) {
            maskSet.add(c);
        }

        // Build the new string by including only non-duplicate characters
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!maskSet.contains(c) || charSet.add(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
