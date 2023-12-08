/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
 Write a Java program to get the contents of a given string as a character array.
Sample Output:The char array equals "[C@2a139a55"
 */
public class prb17 {
    public static void main(String[] args) {
        String originalString = "This is a sample String.";

        // Convert the string to a character array
        char[] charArray = originalString.toCharArray();

        // Convert the character array to a string for proper display
        String charArrayAsString = new String(charArray);

        System.out.println("The char array equals " + charArrayAsString);
    }
}
