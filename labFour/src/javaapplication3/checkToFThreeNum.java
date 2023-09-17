/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;
/**
 * @author yasin
 */
public class checkToFThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int a = sc.nextInt();
        System.out.println("Enter second Number: ");
        int b = sc.nextInt();
        System.out.println("Enter third Number: ");
        int c = sc.nextInt();
        if((a*b*c)>0){
            if(c>b){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }else if((b>a) && (c>b)){
                System.out.println("True");
         }else{
                System.out.println("False");
        }
    }
}