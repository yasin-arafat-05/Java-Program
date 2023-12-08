/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
Write a Java program to remove "b" and "ac" from a given string.
Sample Output:The given string is: abrambabasc
After removing the new string is: aramaasc
 */
public class prb48 {
    public static void main(String[] args) {
        String inputString = "abrambabasc";

        // Remove "b" and "ac" from the string and print the result
        System.out.println("The given string is: " + inputString);
        String resultString = removePatterns(inputString);
        System.out.println("After removing the new string is: " + resultString);
    }

    private static String removePatterns(String s) {
        // Replace "ac" with an empty string, then remove "b"
        return s.replaceAll("ac", "").replaceAll("b", "");
    }
}
