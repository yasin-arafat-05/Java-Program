/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
 Write a Java program to get the contents of a given string as a byte array.
Sample Output:The new String equals This is a sample String.
 */
public class prb16 {
     public static void main(String[] args) {
        String originalString = "This is a sample String.";

        // Convert the string to a byte array
        byte[] byteArray = originalString.getBytes();

        // Convert the byte array back to a new string
        String newString = new String(byteArray);

        System.out.println("The new String equals " + newString);
    }
}
