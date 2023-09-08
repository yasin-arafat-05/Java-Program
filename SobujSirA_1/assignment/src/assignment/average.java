/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;
import java.util.Scanner;
/**
 *
 * @author yasin
 */
public class average {
    public static void main(String[] args) {
        System.out.println("Enter three number: ");
        Scanner sc = new Scanner(System.in);
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();
        sc.close();
        float avg = (a+b+c)/3;
        System.out.println("Average : "+avg);
    }
}
