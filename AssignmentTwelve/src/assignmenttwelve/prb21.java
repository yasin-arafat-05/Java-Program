/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
Write a Java program to get the last index of a string within a string.
Sample Output: a b c d e f g h i j
===========================
36 10 7 40 33 16 42 32 6 20

k l m n o p q r s t
===========================
8 35 22 14 41 23 4 29 24 31

u v w x y z
=================
21 27 13 18 38 37

Sample string of all alphabet: "The quick brown fox jumps over the lazy dog."
 */
public class prb21 {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String sampleString = "The quick brown fox jumps over the lazy dog.";

        // Print alphabet characters
        for (int i = 0; i < alphabet.length(); i++) {
            System.out.print(alphabet.charAt(i) + " ");
        }
        System.out.println("\n===========================");

        // Print the last index of each character in the sample string
        for (int i = 0; i < alphabet.length(); i++) {
            char currentChar = alphabet.charAt(i);
            int lastIndex = sampleString.lastIndexOf(currentChar);
            System.out.print(lastIndex + " ");
        }

        // Add line breaks for better organization
        System.out.println("\n\n===========================");

        // Print alphabet characters
        for (int i = 0; i < alphabet.length(); i++) {
            System.out.print(alphabet.charAt(i) + " ");
        }
        System.out.println("\n===========================");

        // Print the last index of each character in the sample string
        for (int i = 0; i < alphabet.length(); i++) {
            char currentChar = alphabet.charAt(i);
            int lastIndex = sampleString.lastIndexOf(currentChar);
            System.out.print(lastIndex + " ");
        }
    }
}
