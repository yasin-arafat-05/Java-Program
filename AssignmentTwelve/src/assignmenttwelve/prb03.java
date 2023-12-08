/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
 Write a Java program to get the character (Unicode code point) before the specified index within the string.
Sample Output:Original String : w3resource.com
Character(unicode point) = 119
Character(unicode point) = 99
 */
public class prb03 {
     public static void main(String[] args) {
        String originalString = "w3resource.com";
        int index1 = 3;
        int index2 = 7;

        System.out.println("Original String : " + originalString);
        System.out.println("Character(unicode point) = " + (int) originalString.charAt(index1 - 1));
        System.out.println("Character(unicode point) = " + (int) originalString.charAt(index2 - 1));
    }
}
