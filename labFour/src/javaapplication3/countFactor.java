/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;
import java.lang.Math;
/**
 * @author yasin
 */
public class countFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer Number: ");
            int a = sc.nextInt();
        int cnt =0;
        for(int i =1;i<= (int)Math.sqrt(a);i++){
            if(a%i==0 && i*i!=a){
                cnt+=2;
            }else if(i*i == a){
                cnt++;
            }
         }
        System.out.println("Total factor : "+cnt);
    }
}
