/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
Write a Java program to reverse every word in a string using methods.
Sample Output:The given string is: This is a test string
The string reversed word by word is:
sihT si a tset gnirts
 */
public class prb46 {
        public static void main(String[] args) {
        String inputString = "This is a test string";

        // Reverse every word in the string and print the result
        System.out.println("The given string is: " + inputString);
        String reversedWordsString = reverseWords(inputString);
        System.out.println("The string reversed word by word is:\n" + reversedWordsString);
    }

    private static String reverseWords(String s) {
        String[] words = s.split("\\s");
        StringBuilder reversedWordsBuilder = new StringBuilder();

        // Reverse each word and append to the result
        for (String word : words) {
            reversedWordsBuilder.append(reverseString(word));
            reversedWordsBuilder.append(" ");
        }

        return reversedWordsBuilder.toString().trim();
    }

    private static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
