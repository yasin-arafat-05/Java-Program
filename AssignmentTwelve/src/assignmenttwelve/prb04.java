/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
 Write a Java program to count Unicode code points in the specified text range of a string.
Sample Output:Original String : w3rsource.com
Codepoint count = 9
 */
public class prb04 {
    public static void main(String[] args) {
        String originalString = "w3rsource.com";
        int startIndex = 2;
        int endIndex = 11; // specify the range

        System.out.println("Original String : " + originalString);
        System.out.println("Codepoint count = " + originalString.codePointCount(startIndex, endIndex));
    }
}
