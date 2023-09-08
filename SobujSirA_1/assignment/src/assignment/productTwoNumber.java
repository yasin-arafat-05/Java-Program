/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;
import java.util.Scanner;

/**
 *
 * @author yasin
 */
public class productTwoNumber {
    public static void main(String args[]){
        System.out.println("Enter two Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Product of "+a+" * "+b+" = "+(a*b));
    }
}
