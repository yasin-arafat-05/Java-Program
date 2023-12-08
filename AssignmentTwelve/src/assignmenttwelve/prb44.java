/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
 Write a Java program to reverse a string using recursion.
Sample Output:The given string is: The quick brown fox jumps
The string in reverse order is:
spmuj xof nworb kciuq ehT
 */
import java.util.HashMap;
import java.util.Map;

public class prb44 {
    public static void main(String[] args) {
        String inputString = "test string";

        // Find and print the most occurring character
        System.out.println("The given string is: " + inputString);
        char mostFrequent = findMostFrequentCharacter(inputString);
        
        if (mostFrequent != '\0') {
            System.out.println("Max occurring character in the given string is: " + mostFrequent);
        } else {
            System.out.println("No character found in the string.");
        }
    }

    private static char findMostFrequentCharacter(String s) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the occurrences of each character in the string
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        char mostFrequent = '\0';
        int maxCount = 0;

        // Find the most occurring character
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostFrequent;
    } 
}
