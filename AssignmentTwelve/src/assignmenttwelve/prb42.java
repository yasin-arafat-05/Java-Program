/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
 Write a Java program to print a list of items containing all characters of a given word.
Sample Output:The given strings are: rabbit bribe dog
The given word is: bib

The strings containing all the letters of the given word are:
rabbit
bribe
 */

import java.util.ArrayList;
import java.util.List;

public class prb42 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("rabbit");
        strings.add("bribe");
        strings.add("dog");

        String givenWord = "bib";

        // Print strings containing all letters of the given word
        System.out.println("The given strings are: " + strings);
        System.out.println("The given word is: " + givenWord);
        List<String> result = getStringsContainingWord(strings, givenWord);
        System.out.println("\nThe strings containing all the letters of the given word are:");
        for (String s : result) {
            System.out.println(s);
        }
    }

    private static List<String> getStringsContainingWord(List<String> strings, String word) {
        List<String> result = new ArrayList<>();

        // Check each string for containing all letters of the given word
        for (String s : strings) {
            boolean containsAllLetters = true;
            for (char c : word.toCharArray()) {
                if (s.indexOf(c) == -1) {
                    containsAllLetters = false;
                    break;
                }
            }
            if (containsAllLetters) {
                result.add(s);
            }
        }

        return result;
    }
}
