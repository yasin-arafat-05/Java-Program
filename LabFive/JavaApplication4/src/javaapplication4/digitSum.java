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
public class digitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int n = sc.nextInt();
        sc.close();
        while(n!=0){
            ans += n%10;
            n/=10;
        }
        System.out.println("sum of digit : "+ans);
    }
}
