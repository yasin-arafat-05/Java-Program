/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHanddling;
import java.util.Scanner;
/**
 * @author yasin
 */

/*
Create a program to ask the user for a real number and display its square root. 
Errors must be trapped using "try..catch".
*/

public class prb2 {
    public static void main(String[] args) {
        System.out.println("Enter a real number : ");
        int n = new Scanner(System.in).nextInt();
        try {
            if (n < 0) {
                throw new IllegalArgumentException("Number should be positive.");
            }

            System.out.println("Square root: " + Math.sqrt(n));

        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("baki code . . . .");
    }
}

