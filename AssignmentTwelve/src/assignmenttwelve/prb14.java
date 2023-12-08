/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
 Write a Java program to compare a given string to another string, ignoring case considerations.
Sample Output:"Stephen Edwin King" equals "Walter Winchell"? false
"Stephen Edwin King" equals "stephen edwin king"? true
 */
public class prb14 {
    public static void main(String[] args) {
        String str1 = "Stephen Edwin King";
        String str2 = "Walter Winchell";
        String str3 = "stephen edwin king";

        System.out.println("\"" + str1 + "\" equals \"" + str2 + "\"? " + str1.equalsIgnoreCase(str2));
        System.out.println("\"" + str1 + "\" equals \"" + str3 + "\"? " + str1.equalsIgnoreCase(str3));
    }
}
