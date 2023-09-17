/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author yasin
 */
public class equlToTwenty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if( (b>=20) && (Math.abs(a-c))>b){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
