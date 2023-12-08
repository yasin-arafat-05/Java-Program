/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
Write a Java program to concatenate a given string to the end of another string.

Sample Output:String 1: PHP Exercises and
String 2: Python Exercises
The concatenated string: PHP Exercises and Python Exercises
 */
public class prb07 {
    public static void main(String[] args) {
        String str1 = "PHP Exercises and";
        String str2 = " Python Exercises";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        String concatenatedString = str1.concat(str2);

        System.out.println("The concatenated string: " + concatenatedString);
    }
}
