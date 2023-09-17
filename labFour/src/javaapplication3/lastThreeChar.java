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
public class lastThreeChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        int len = s.length();
        String sub = s.substring((len-4));
        String out = "";
        for(int i=0;i<4;i++){
            out+=sub;
        }
        System.out.println("OUTPUT: "+out);
    }
}