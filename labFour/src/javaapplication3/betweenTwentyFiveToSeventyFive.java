/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;
/**
 * @author yasin
 */
public class betweenTwentyFiveToSeventyFive {
    
        static String out(char []a,char []b){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    return "True";
                }
            }
        }
        return "False";
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Number between 25 to 75: ");
        String a = sc.next();
        String b = sc.next();
        System.out.println(""+out(a.toCharArray(),b.toCharArray()));
    }
}
