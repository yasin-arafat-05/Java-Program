/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
  Write a Java program to check whether two strings interlive of a given string. Assuming that unique characters are present in both strings.
Sample Output:The given string is: PMQNO
The interleaving strings are MNO and PQ
The given string is interleaving: true

The given string is: PNQMO
The interleaving strings are MNO and PQ
The given string is interleaving: false

 */
public class prb36 {
    public static void main(String[] args) {
        String str1 = "PMQNO";
        String str2 = "MNO";
        String str3 = "PQ";

        // Check if the given string is interleaving of str2 and str3
        System.out.println("The given string is: " + str1);
        System.out.println("The interleaving strings are: " + str2 + " and " + str3);
        boolean isInterleaving = isInterleaving(str1, str2, str3);
        System.out.println("The given string is interleaving: " + isInterleaving);

        // Additional example
        String str4 = "PNQMO";
        System.out.println("\nThe given string is: " + str4);
        System.out.println("The interleaving strings are: " + str2 + " and " + str3);
        boolean isInterleaving2 = isInterleaving(str4, str2, str3);
        System.out.println("The given string is interleaving: " + isInterleaving2);
    }

    private static boolean isInterleaving(String s, String s1, String s2) {
        int i = 0, j = 0, k = 0;

        // Iterate through the characters of the given string
        while (k < s.length()) {
            // Check if the current character of the given string matches the current character of s1
            if (i < s1.length() && s.charAt(k) == s1.charAt(i)) {
                i++;
            }
            // Check if the current character of the given string matches the current character of s2
            else if (j < s2.length() && s.charAt(k) == s2.charAt(j)) {
                j++;
            }
            // If no match is found, the string is not interleaving
            else {
                return false;
            }

            k++;
        }

        // Check if both s1 and s2 are completely used
        return i == s1.length() && j == s2.length();
    } 
}
