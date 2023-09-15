/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercisethree;
import java.util.*;
import java.lang.Math;

/**
 *
 * @author yasin
 */
public class areaOFHexagon {
    public static void main(String[] args) {
        final double PI = Math.PI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of a hexagon: ");
        double l = sc.nextDouble();
        double area = (6d*l*l)/(4d*Math.tan(PI/6d));
        System.out.println("Area : "+area);
    }
}
