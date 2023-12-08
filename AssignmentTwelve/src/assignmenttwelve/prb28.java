/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
  Write a Java program to create a character array containing a string.
Sample Output:Java Exercises.
 */
public class prb28 {
    public static void main(String[] args) {
        String inputString = "Java Exercises.";

        // Convert the string to a character array
        char[] charArray = stringToCharArray(inputString);

        // Print the character array
        System.out.println(charArray);
    }

    private static char[] stringToCharArray(String input) {
        // Use the toCharArray method to convert the string to a character array
        return input.toCharArray();
    }
}
