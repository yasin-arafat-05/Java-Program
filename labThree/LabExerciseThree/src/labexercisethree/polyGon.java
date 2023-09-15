/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercisethree;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author yasin
 */
public class polyGon {
    public static void main(String[] args) {
        double PI = Math.PI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Side of a Polygone: ");
        double n = sc.nextDouble();
        System.out.println("Enter the number of length of the Polygone: ");
        double l = sc.nextDouble();
        double x = PI/n;
        double area = (n*l*l)/(4d*Math.tan(x));
        System.out.println("Area is : "+ area);
    }
}
