/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
 Write a Java program to create a distinct identifier for a given string.
Sample Output:The hash for Python Exercises. is 863132599
 */
public class prb18 {
    public static void main(String[] args) {
        String originalString = "Python Exercises.";

        // Get the hash code for the string
        int hashCode = originalString.hashCode();

        System.out.println("The hash for " + originalString + " is " + hashCode);
    }
}
