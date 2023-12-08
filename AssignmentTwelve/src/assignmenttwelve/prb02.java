/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
Write a Java program to get the character (Unicode code point) at the given index within the string.
Sample Output:Original String : w3resource.com
Character(unicode point) = 51
Character(unicode point) = 101
 */
public class prb02 {
     public static void main(String[] args) {
        String originalString = "w3resource.com";
        int index1 = 3;
        int index2 = 7;

        System.out.println("Original String : " + originalString);
        System.out.println("Character(unicode point) = " + (int) originalString.charAt(index1));
        System.out.println("Character(unicode point) = " + (int) originalString.charAt(index2));
    }
}
