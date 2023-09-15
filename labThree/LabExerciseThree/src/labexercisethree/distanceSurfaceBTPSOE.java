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
public class distanceSurfaceBTPSOE {
    public static void main(String[] args) {
        final double radious = 6371.01d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first latitude of coordinate : ");
        double x1 = sc.nextDouble();
        System.out.println("Enter the first longitude of coordinate : ");
        double y1 = sc.nextDouble();
        System.out.println("Enter the second latitude of coordinate : ");
        double x2 = sc.nextDouble();
        System.out.println("Enter the second longitude of corrdinate: ");
        double y2 = sc.nextDouble();
        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);
        y1 = Math.toRadians(y1);
        y2 = Math.toRadians(y2);
        double k = y1-y2;
        double s = Math.sin(x1) * Math.sin(x2);
        double l  = Math.cos(x1) * Math.cos(x2) * Math.cos(k);
        double finalstep = s+l;
        double area = radious*Math.acos(finalstep);
        System.out.println("Area : "+area);
    }
}
