/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.Scanner;

/**
 * @author yasin
 */
public class rightMostDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = a*b*c;
        if(k<0){
            System.out.println("False");
        }else{
            int rma = a%10;
            int rmb = b%10;
            int rmc = c%10;
            if((rma==rmb) || (rmb==rmc)||(rmc==rma)){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
    }
}
5 