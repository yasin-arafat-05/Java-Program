/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
Write a Java program to create a String object with a character array.
Sample Output:The book contains 234 pages.
 */
public class prb11 {
     public static void main(String[] args) {
        char[] charArray = {'T', 'h', 'e', ' ', 'b', 'o', 'o', 'k', ' ', 'c', 'o', 'n', 't', 'a', 'i', 'n', 's', ' ', '2', '3', '4', ' ', 'p', 'a', 'g', 'e', 's', '.'};

        // Creating a String object from the character array
        String resultString = new String(charArray);

        System.out.println(resultString);
    }
}
