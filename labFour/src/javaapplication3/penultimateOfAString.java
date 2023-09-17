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
public class penultimateOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String in = sc.nextLine();
        String []arr = in.split(" ");
        System.out.println("Output: "+arr[arr.length-2]);
    }
}
