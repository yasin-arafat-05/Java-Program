/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
Write a Java program to test if a given string contains the specified sequence of char values.
* 
Sample Output:Original String: PHP Exercises and Python Exercises
Specified sequence of char values: and
true
 */
public class prb08 {
    public static void main(String[] args) {
        String originalString = "PHP Exercises and Python Exercises";
        String sequenceToCheck = "and";

        System.out.println("Original String: " + originalString);
        System.out.println("Specified sequence of char values: " + sequenceToCheck);

        boolean containsSequence = originalString.contains(sequenceToCheck);

        System.out.println(containsSequence);
    }
}
