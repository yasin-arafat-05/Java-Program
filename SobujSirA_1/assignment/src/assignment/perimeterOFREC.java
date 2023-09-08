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
public class perimeterOFREC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height and width of a ractangle: ");
            float a = sc.nextFloat();
            float b = sc.nextFloat();
        sc.close();
        System.out.println("Perimeter: "+(2*(a+b)));
    }
}
