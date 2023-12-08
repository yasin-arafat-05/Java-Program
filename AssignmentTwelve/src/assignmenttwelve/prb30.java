/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
Write a Java program to convert all characters in a string to uppercase.
Sample Output:Original String: The Quick BroWn FoX!
String in uppercase: THE QUICK BROWN FOX!
 */
public class prb30 {
     public static void main(String[] args) {
        String originalString = "The Quick BroWn FoX!";

        // Convert the string to uppercase
        String upperCaseString = convertToUpperCase(originalString);

        // Print the original and uppercase strings
        System.out.println("Original String: " + originalString);
        System.out.println("String in uppercase: " + upperCaseString);
    }

    private static String convertToUpperCase(String input) {
        // Use the toUpperCase method to convert all characters to uppercase
        return input.toUpperCase();
    }
}
