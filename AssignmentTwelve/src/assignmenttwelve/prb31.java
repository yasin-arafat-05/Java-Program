/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
 Write a Java program to trim leading or trailing whitespace from a given string.
Sample Output:Original String: Java Exercises
New String: Java Exercises
 */
public class prb31 {
     public static void main(String[] args) {
        String originalString = "   Java Exercises   ";

        // Trim leading and trailing whitespace
        String trimmedString = trimWhitespace(originalString);

        // Print the original and trimmed strings
        System.out.println("Original String: " + originalString);
        System.out.println("New String: " + trimmedString);
    }

    private static String trimWhitespace(String input) {
        // Use the trim method to remove leading and trailing whitespace
        return input.trim();
    }
}
