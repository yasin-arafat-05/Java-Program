/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
 Write a Java program to compare a given string to the specified character sequence.
Sample Output:Comparing example.com and example.com: true
Comparing Example.com and example.com: false
 */
public class prb09 {
    public static void main(String[] args) {
        String str1 = "example.com";
        String str2 = "example.com";
        String sequence = "example.com";

        System.out.println("Comparing " + str1 + " and " + sequence + ": " + str1.equals(sequence));
        System.out.println("Comparing " + str2 + " and " + sequence + ": " + str2.equals(sequence));
    }
}
