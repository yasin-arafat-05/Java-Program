/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
 Write a Java program to find out whether a region in the current string matches a region in another string.
Sample Output:str1[0 - 7] == str2[28 - 35]? true
str1[9 - 15] == str2[9 - 15]? false

 */
public class prb23 {
     public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = "This is HelloWorld Example";

        // Compare regions in the strings
        boolean match1 = str1.regionMatches(0, str2, 28, 8);
        boolean match2 = str1.regionMatches(9, str2, 9, 7);

        System.out.println("str1[0 - 7] == str2[28 - 35]? " + match1);
        System.out.println("str1[9 - 15] == str2[9 - 15]? " + match2);
    }
}
