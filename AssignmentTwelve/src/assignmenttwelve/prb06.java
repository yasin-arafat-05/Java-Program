/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
Write a Java program to compare two strings lexicographically, ignoring case differences.
Sample Output:String 1: This is exercise 1
String 2: This is Exercise 1
"This is exercise 1" is equal to "This is Exercise 1"
 */
public class prb06 {
    public static void main(String[] args) {
        String str1 = "This is exercise 1";
        String str2 = "This is Exercise 1";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);

        if (isEqualIgnoreCase) {
            System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\"");
        } else {
            System.out.println("\"" + str1 + "\" is not equal to \"" + str2 + "\"");
        }
    }
}
