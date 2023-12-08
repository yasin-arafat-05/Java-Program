/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
Write a Java program to get the Canonical representation of the string object.
Sample Output:str1 == str2? false
str1 == str3? true
 */
public class prb20 {
     public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = "Hello";

        System.out.println("str1 == str2? " + (str1.intern() == str2.intern()));
        System.out.println("str1 == str3? " + (str1.intern() == str3.intern()));
    }
}
