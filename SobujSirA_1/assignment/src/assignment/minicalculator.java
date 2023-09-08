/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;
import java.util.*;
import java.util.Scanner;
/**
 * @author yasin
 */
public class minicalculator {
    public static void main(String []args){
        System.out.println("Choose your sign:(+,-,*,/,%):  ");
        Scanner sc = new Scanner(System.in);
            char ch = sc.next().charAt(0);
            System.out.println("Enter two Number: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
         switch(ch){
             case '+':
                 System.out.println(a+" + "+b+" = "+(a+b));
                 break;
             case '-':
                 System.out.println(a+" - "+b+" = "+(a-b));
                 break;
             case '*':
                 System.out.println(a+" * "+b+" = "+(a*b));
                 break;
             case '%':
                 System.out.println(a+" % "+b+" = "+(a%b));
                 break;
             case '/':
                 if(b==0){
                     System.out.println("Division is not possible.");
                     return ;
                 }else{
                     System.out.println(a+" / "+b+" = "+(a/b));
                 }
                 break;
             default:
                 System.out.println("Not a valid Sign.");
         }
    }
}