/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
  Write a Java program to print all permutations of a given string with repetition.
Sample Output:The given string is: PQR
The permuted strings are:
PPP
PPQ
PPR
...
RRP
RRQ
RRR
 */
public class prb35 {
     public static void main(String[] args) {
        String inputString = "PQR";

        // Print all permutations of the given string with repetition
        System.out.println("The given string is: " + inputString);
        System.out.println("The permuted strings are:");
        printPermutationsWithRepetition(inputString, "");
    }

    private static void printPermutationsWithRepetition(String s, String current) {
        // Base case: if the current permutation has the same length as the original string, print it
        if (current.length() == s.length()) {
            System.out.println(current);
            return;
        }

        // Iterate through the characters of the original string
        for (int i = 0; i < s.length(); i++) {
            // Recursively generate permutations by appending each character to the current permutation
            printPermutationsWithRepetition(s, current + s.charAt(i));
        }
    }
}
