/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
  Write a Java program to find all interleavings of given strings.
Sample Output:The given strings are: WX YZ
The interleavings strings are:
YWZX
WYZX
YWXZ
WXYZ
YZWX
WYXZ
 */
public class prb33 {
    public static void main(String[] args) {
        String str1 = "WX";
        String str2 = "YZ";

        // Find and print all interleavings of the given strings
        System.out.println("The given strings are: " + str1 + " " + str2);
        System.out.println("The interleavings strings are:");
        printInterleavings(str1, str2, "", 0, 0);
    }

    private static void printInterleavings(String str1, String str2, String result, int i, int j) {
        // Base case: if both strings are processed, print the interleaved string
        if (i == str1.length() && j == str2.length()) {
            System.out.println(result);
            return;
        }

        // Process characters from the first string
        if (i < str1.length()) {
            printInterleavings(str1, str2, result + str1.charAt(i), i + 1, j);
        }

        // Process characters from the second string
        if (j < str2.length()) {
            printInterleavings(str1, str2, result + str2.charAt(j), i, j + 1);
        }
    } 
}
