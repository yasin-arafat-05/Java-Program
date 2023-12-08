/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
Write a Java program to get the character at the given index within the string.
Sample Output:Original String = Java Exercises!
The character at position 0 is J
The character at position 10 is i
 */

public class prb01 {
    public static void main(String[] args) {
        String originalString = "Java Exercises!";
        int index1 = 0;
        int index2 = 10;

        System.out.println("Original String = " + originalString);
        System.out.println("The character at position " + index1 + " is " + originalString.charAt(index1));
        System.out.println("The character at position " + index2 + " is " + originalString.charAt(index2));
    }
}
