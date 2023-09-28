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
public class playwithInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        while(n!=1){
            if(n%2==0){
                n /=2;
            }else{
                n *=3 + 1;
            }
        }
        System.out.println("Value of n is : "+ n);
    }
}