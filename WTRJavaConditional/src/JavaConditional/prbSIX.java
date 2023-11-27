/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaConditional;

/**
 *
 * @author yasin
 */
/*
6. Write a Java program that reads two floating-point numbers 
and tests whether they are the same up to three decimal places.

Test Data
Input floating-point number: 25.586
Input floating-point another number: 25.589
Expected Output :
They are different
*/
import java.util.Scanner;
public class prbSIX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first floating-point numbers: ");
        float a = sc.nextFloat();
        System.out.println("Enter second floating-point numbers: ");
        float b = sc.nextFloat();
        if(a==b){
            System.out.println("Number is equal.");
        }else{
            System.out.println("They are different.");
        }
    }
}
