/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
Write a Java program to compare a given string to a specified string buffer.
Sample Output:Comparing example.com and example.com: true
Comparing Example.com and example.com: false
 */
public class prb10 {
     public static void main(String[] args) {
        String str1 = "example.com";
        String str2 = "Example.com";
        StringBuffer stringBuffer = new StringBuffer("example.com");

        System.out.println("Comparing " + str1 + " and " + stringBuffer + ": " + str1.equals(stringBuffer.toString()));
        System.out.println("Comparing " + str2 + " and " + stringBuffer + ": " + str2.equals(stringBuffer.toString()));
    }
}
