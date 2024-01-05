/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
Create a program to ask the user for a real number and display its square root. Errors
must be trapped using "try..catch".
*/
package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author yasin
 */
public class prbTWO {
    public static void main(String[] args) {
        System.out.println("Enter a Real Number: ");
        int k;
        Scanner sc = new Scanner(System.in);
         try{ 
             k = sc.nextInt();
            if( k <0){throw new InputMismatchException("");}
        System.out.println("SquareRoot: " + Math.sqrt(k));
    }catch(InputMismatchException e){
        System.out.println("invalid input! ");
    }
    }
}
