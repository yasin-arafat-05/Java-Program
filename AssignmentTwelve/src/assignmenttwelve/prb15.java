/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
 Write a Java program to print the current date and time in the specified format.
Sample Output:Current Date and Time :
June 19, 2017
3:13 pm
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class prb15 {
    public static void main(String[] args) {
        // Get the current date and time
        Date currentDate = new Date();

        // Define the desired date and time format
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d, yyyy\nh:mm a");

        // Format and print the current date and time
        System.out.println("Current Date and Time :\n" + dateFormat.format(currentDate));
    }
}
