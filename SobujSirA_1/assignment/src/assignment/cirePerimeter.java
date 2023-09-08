/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author yasin
 */
public class cirePerimeter {
    static float r = 7.5f;
    static float pi = 3.1416f;
    public static void main(String args[]){
      float area  = pi*r*r;
      float peri = (2*pi*r);
      System.out.printf("area = %.15f \nperimeter = %.15f",area,peri);
      System.out.println();
    }
}
