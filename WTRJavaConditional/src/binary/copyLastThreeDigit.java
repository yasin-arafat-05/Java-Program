/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binary;

/**
 *
 * @author yasin
 */
import java.util.Scanner;

public class copyLastThreeDigit {
    public static void main(String[] args) {
        System.out.println("Enter the string of 4 digit: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String sub = s.substring(1);
        String ans = "";
        ans += s+sub+sub+sub;
        System.out.println(ans);
    }
}
