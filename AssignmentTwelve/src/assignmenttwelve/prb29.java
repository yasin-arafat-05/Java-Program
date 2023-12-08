/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
Write a Java program to convert all characters in a string to lowercase.
Sample Output:Original String: The Quick BroWn FoX!
String in lowercase: the quick brown fox!
 */
public class prb29 {
     public static void main(String[] args) {
        String originalString = "The Quick BroWn FoX!";

        // Convert the string to lowercase
        String lowerCaseString = convertToLowerCase(originalString);

        // Print the original and lowercase strings
        System.out.println("Original String: " + originalString);
        System.out.println("String in lowercase: " + lowerCaseString);
    }

    private static String convertToLowerCase(String input) {
        // Use the toLowerCase method to convert all characters to lowercase
        return input.toLowerCase();
    }
}
