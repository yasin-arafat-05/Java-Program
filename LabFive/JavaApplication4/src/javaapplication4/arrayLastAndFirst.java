/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;
import java.util.Scanner;
/**
 * @author yasin
 */
public class arrayLastAndFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter array Element: ");
        int []arr  = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(arr[0]==10 && arr[n-1]==10){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
