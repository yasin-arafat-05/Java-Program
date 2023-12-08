/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
Write a Java program to find the second most frequent character in a given string.
Sample Output:The given string is: successes
The second most frequent char in the string is: c
 */

import java.util.HashMap;
import java.util.Map;

public class prb34 {
    public static void main(String[] args) {
        String inputString = "successes";

        // Find and print the second most frequent character
        System.out.println("The given string is: " + inputString);
        char secondMostFrequentChar = findSecondMostFrequentCharacter(inputString);
        System.out.println("The second most frequent char in the string is: " + secondMostFrequentChar);
    }

    private static char findSecondMostFrequentCharacter(String s) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        char mostFrequentChar = ' ';
        int mostFrequentCount = 0;
        char secondMostFrequentChar = ' ';
        int secondMostFrequentCount = 0;

        // Find the most and second most frequent characters
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            int count = entry.getValue();
            
            if (count > mostFrequentCount) {
                secondMostFrequentCount = mostFrequentCount;
                secondMostFrequentChar = mostFrequentChar;
                mostFrequentCount = count;
                mostFrequentChar = entry.getKey();
            } else if (count > secondMostFrequentCount && count != mostFrequentCount) {
                secondMostFrequentCount = count;
                secondMostFrequentChar = entry.getKey();
            }
        }

        return secondMostFrequentChar;
    }
}
