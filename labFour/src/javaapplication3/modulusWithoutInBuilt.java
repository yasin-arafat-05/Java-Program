/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author yasin
 */
public class modulusWithoutInBuilt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Number:(a>b) ");
            int a = sc.nextInt();
            int b = sc.nextInt();
        int c = a/b;
        int rem = a - (c*b);
        System.out.println("rem: "+rem);
    }
}
