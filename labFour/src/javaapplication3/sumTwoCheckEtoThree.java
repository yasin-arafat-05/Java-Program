/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.Scanner;
/**
 * @author yasin
 */
public class sumTwoCheckEtoThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int a = sc.nextInt();
        System.out.println("Enter second Number: ");
        int b = sc.nextInt();
        System.out.println("Enter third Number: ");
        int c = sc.nextInt();
        if(a+b==c){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}