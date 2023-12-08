/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
Write a Java program to check whether a given string ends with another string.
Sample Output:"Python Exercises" ends with "se"? false
"Python Exercise" ends with "se"? true
 */
public class prb12 {
    public static void main(String[] args) {
        String str1 = "Python Exercises";
        String str2 = "Python Exercise";

        System.out.println("\"" + str1 + "\" ends with \"se\"? " + str1.endsWith("se"));
        System.out.println("\"" + str2 + "\" ends with \"se\"? " + str2.endsWith("se"));
    }
}
