/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercisethree;
import java.util.Scanner;
/**
 *
 * @author yasin
 */
public class sumDigit {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum +=s.charAt(i)-'0';
        }
        System.out.println("Sum of Digit : "+sum);
    }
}
