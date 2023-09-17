/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.lang.StringBuilder;
import java.util.Scanner;
/**
 *
 * @author yasin
 */
public class reverseWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        System.out.println("Reverse Str: "+sb.reverse());
    }
 
}
