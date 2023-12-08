/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
Write a Java program to print the result of removing duplicates from a given string.
Sample Output:The given string is: w3resource
After removing duplicates characters the new string is: w3resouc
 */
import java.util.LinkedHashSet;

public class prb38 {
    public static void main(String[] args) {
        String inputString = "w3resource";

        // Remove duplicates and print the new string
        System.out.println("The given string is: " + inputString);
        String result = removeDuplicates(inputString);
        System.out.println("After removing duplicates characters the new string is: " + result);
    }

    private static String removeDuplicates(String s) {
        // Use LinkedHashSet to maintain the order of characters
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();

        // Iterate through the characters of the string and add them to the set
        for (char c : s.toCharArray()) {
            charSet.add(c);
        }

        // Create a new string from the set of unique characters
        StringBuilder result = new StringBuilder();
        for (Character c : charSet) {
            result.append(c);
        }

        return result.toString();
    }
}
