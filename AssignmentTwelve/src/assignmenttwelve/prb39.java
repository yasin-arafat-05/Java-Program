/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
Write a Java program to find the first non-repeating character in a string.
Sample Output:The given string is: gibblegabbler
The first non repeated character in String is: i
 */
import java.util.HashMap;
import java.util.Map;

public class prb39 {
    public static void main(String[] args) {
        String inputString = "gibblegabbler";

        // Find and print the first non-repeating character
        System.out.println("The given string is: " + inputString);
        char firstNonRepeating = findFirstNonRepeatingCharacter(inputString);
        
        if (firstNonRepeating != '\0') {
            System.out.println("The first non-repeated character in the string is: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }
    }

    private static char findFirstNonRepeatingCharacter(String s) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the occurrences of each character in the string
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character
        for (char c : s.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }

        // If no non-repeating character is found, return '\0'
        return '\0';
    } 
}
