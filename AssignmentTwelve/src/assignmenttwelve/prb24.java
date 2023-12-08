/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
Write a Java program to replace a specified character with another character.
Sample Output:Original string: The quick brown fox jumps over the lazy dog.
New String: The quick brown fox jumps over the lazy fog.
 */
public class prb24 {
    public static void main(String[] args) {
        String originalString = "The quick brown fox jumps over the lazy dog.";
        char targetChar = 'd';
        char replacementChar = 'g';

        // Replace the specified character
        String newString = replaceCharacter(originalString, targetChar, replacementChar);

        // Print the original and new strings
        System.out.println("Original string: " + originalString);
        System.out.println("New String: " + newString);
    }

    private static String replaceCharacter(String input, char target, char replacement) {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == target) {
                charArray[i] = replacement;
            }
        }
        return new String(charArray);
    }
}
