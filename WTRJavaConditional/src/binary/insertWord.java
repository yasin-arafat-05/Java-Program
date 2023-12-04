/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binary;

/**
 * @author yasin
 */

import java.util.Scanner;
public class insertWord {
    public static void main(String[] args) {
        System.out.println("Enter a sentence of two words: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Enter the word add in the middle: ");
        String add = sc.next();
        String k[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(k[0]).append(" ").append(add).append(" ").append(k[1]);
        System.out.println(sb);
        
    }
}
