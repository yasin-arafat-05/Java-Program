/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
Write a Java program to reverse words in a given string.
Sample Output:The given string is: Reverse words in a given string
The new string after reversed the words: string given a in words Reverse
 */
public class prb45 {
    public static void main(String[] args) {
        String inputString = "Reverse words in a given string";

        // Reverse the words in the string and print the result
        System.out.println("The given string is: " + inputString);
        String reversedWordsString = reverseWords(inputString);
        System.out.println("The new string after reversed the words:\n" + reversedWordsString);
    }

    private static String reverseWords(String s) {
        String[] words = s.split("\\s");
        StringBuilder reversedWordsBuilder = new StringBuilder();

        // Reverse each word and append to the result
        for (int i = words.length - 1; i >= 0; i--) {
            reversedWordsBuilder.append(words[i]);
            if (i > 0) {
                reversedWordsBuilder.append(" ");
            }
        }

        return reversedWordsBuilder.toString();
    }
}
