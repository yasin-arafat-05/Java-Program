/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;
import java.util.Scanner;
/**
 * @author yasin
 */
public class addTwoNumber {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number: ");
        long a = sc.nextInt();
        long b = sc.nextInt();
        sc.close();
        System.out.println("the sum of two number is = "+(a+b));
    }
}
