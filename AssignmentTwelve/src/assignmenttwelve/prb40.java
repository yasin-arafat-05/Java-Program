/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
 Write a Java program to divide a string into n equal parts.
Sample Output:The given string is: abcdefghijklmnopqrstuvwxy
The string divided into 5 parts and they are:

abcde
fghij
klmno
pqrst
uvwxy
 */
public class prb40 {
    public static void main(String[] args) {
        String inputString = "abcdefghijklmnopqrstuvwxyz";
        int parts = 5;

        // Divide the string into equal parts and print them
        System.out.println("The given string is: " + inputString);
        System.out.println("The string divided into " + parts + " parts and they are:\n");
        divideString(inputString, parts);
    }

    private static void divideString(String s, int parts) {
        int length = s.length();
        int partSize = length / parts;
        int startIndex = 0;

        for (int i = 1; i <= parts; i++) {
            int endIndex = i * partSize;
            // Handle the last part, which might be smaller than the other parts
            if (i == parts) {
                endIndex = length;
            }

            // Extract and print the current part
            String part = s.substring(startIndex, endIndex);
            System.out.println(part);

            // Update the start index for the next part
            startIndex = endIndex;
        }
    }
}
