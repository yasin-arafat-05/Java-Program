/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;
/**
 * @author yasin
 */
public class concrate {
    public static void main(String[] args) {
        String a = "Python";
        String b = "Tutorial";
        String subA = a.substring(1);
        String subB = b.substring(1);
        String out = subA.concat(subB);
        System.out.println("Result: "+out);
    }
}
