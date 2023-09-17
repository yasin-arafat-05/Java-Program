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
public class divisibleRange {
    public static void main(String[] args) {
        System.out.println("Enter two interger (range: a>b)  :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter a number lies between "+a+" to "+b);
        int c = sc.nextInt();
        int cnt=0;
        for(int i=a;i<=b;i++){
            if(i%c==0){
                cnt++;
            }
        }
        System.out.println("total number: "+cnt);
    }
}