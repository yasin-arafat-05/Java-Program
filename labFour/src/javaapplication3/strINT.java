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
public class strINT {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Enter a number (take as a String): ");
        String str = sc.next();
        int out = Integer.parseInt(str);
        System.out.println("Value in int: "+out);
    }
}
