/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
Write a Java program to check whether a given string starts with another string.
Sample Output:Red is favorite color. starts with Red? true
Orange is also my favorite color. starts with Red? false
 */
public class prb26 {
    public static void main(String[] args) {
        String str1 = "Red is favorite color.";
        String str2 = "Red";

        // Check if str1 starts with str2
        boolean startsWith = str1.startsWith(str2);

        // Print the result
        System.out.println(str1 + " starts with " + str2 + "? " + startsWith);
    }
}
