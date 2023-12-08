/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
Write a Java program to replace each substring of a given string that matches 
the given regular expression with the given replacement.
 
Sample string : "The quick brown fox jumps over the lazy dog."
In the above string replace all the fox with cat.
Sample Output:Original string: The quick brown fox jumps over the lazy dog.
New String: The quick brown cat jumps over the lazy dog.
 */
public class prb25 {
    public static void main(String[] args) {
        String originalString = "The quick brown fox jumps over the lazy dog.";
        String regexToReplace = "fox";
        String replacement = "cat";

        // Replace each substring that matches the given regular expression
        String newString = originalString.replaceAll(regexToReplace, replacement);

        // Print the original and new strings
        System.out.println("Original string: " + originalString);
        System.out.println("New String: " + newString);
    }
}
