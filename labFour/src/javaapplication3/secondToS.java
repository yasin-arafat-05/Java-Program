/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;
/**
 * @author yasin
 */
public class secondToS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter second: ");
        int  s = sc.nextInt();
        int h = s/(60*60);
        int m = (s-(h*60*60))/60;
        int es = (s-((m*60)+(h*60*60)));
        System.out.println("h:m:s = "+h+" : "+m+" : "+es);
    }
}
