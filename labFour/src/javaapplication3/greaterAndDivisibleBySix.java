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
public class greaterAndDivisibleBySix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if(a==b){
            System.out.println(0);
        }else if(a%6==b%6){
            System.out.println("min: "+ min);
        }else{
            System.out.println("max: "+max);
        }
    }
}