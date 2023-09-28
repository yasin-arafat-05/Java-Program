/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;
import java.util.Scanner;
/**
 *
 * @author yasin
 */
public class stringToArray {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a string that only contain integer value: ");
       String s = sc.next();
       char []out = s.toCharArray();
       for(char c : out){
           System.out.print(" "+c);
       }
        System.out.println("");
    }
}
