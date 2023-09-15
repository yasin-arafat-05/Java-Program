/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercisethree;
import java.util.*;
/**
 * @author yasin
 */
public class compareTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int a = sc.nextInt();
        System.out.println("Enter second Number: ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }else if(a==b){
            System.out.println(a+" and "+b+" is equal");
        }else{
            System.out.println(a+" is less than "+b); 
        }
    }
}