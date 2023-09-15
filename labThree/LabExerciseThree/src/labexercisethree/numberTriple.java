/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercisethree;
import java.util.Scanner;
/**
 * @author yasin
 */
public class numberTriple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int b = (a*10)+a;
        int c = (b*10)+a;
        System.out.println(a+" + "+b+" + "+c+" = "+(a+b+c));
    }
    
}
