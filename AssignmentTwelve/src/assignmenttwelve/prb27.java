/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
Write a Java program to get a substring of a given string at two specified positions.
Sample Output:old = The quick brown fox jumps over the lazy dog.
new = brown fox jumps
 */
public class prb27 {
    public static void main(String[] args) {
        String originalString = "The quick brown fox jumps over the lazy dog.";
        int startPosition = 10;
        int endPosition = 26;

        // Get the substring between the specified positions
        String newString = getSubstring(originalString, startPosition, endPosition);

        // Print the original and new strings
        System.out.println("old = " + originalString);
        System.out.println("new = " + newString);
    }

    private static String getSubstring(String input, int start, int end) {
        // Ensure start and end positions are within the bounds of the string
        start = Math.max(0, start);
        end = Math.min(end, input.length());

        // Get the substring
        return input.substring(start, end);
    }
}
