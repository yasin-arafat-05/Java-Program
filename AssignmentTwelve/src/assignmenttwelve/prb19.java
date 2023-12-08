/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
 Write a Java program to get the index of all the characters of the alphabet.
Sample Output:a b c d e f g h i j
=========================
36 10 7 40 2 16 42 1 6 20

k l m n o p q r s t
===========================
8 35 22 14 12 23 4 11 24 31

u v w x y z
================
5 27 13 18 38 37
 */
public class prb19 {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        // Print alphabet characters
        for (int i = 0; i < alphabet.length(); i++) {
            System.out.print(alphabet.charAt(i) + " ");
        }
        System.out.println("\n=========================");

        // Print the index of each character
        for (int i = 0; i < alphabet.length(); i++) {
            System.out.print((int) alphabet.charAt(i) + " ");
        }

        // Add line breaks for better organization
        System.out.println("\n\n===========================");

        // Print alphabet characters and their corresponding indexes in groups
        for (int i = 0; i < alphabet.length(); i++) {
            System.out.print(alphabet.charAt(i) + " ");
        }
        System.out.println("\n===========================");
        for (int i = 0; i < alphabet.length(); i++) {
            System.out.print((int) alphabet.charAt(i) + " ");
        }
    }
}

