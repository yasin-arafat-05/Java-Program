/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author yasin
 */
public class addFirstAndLast {
    public static void main(String[] args) {
        String str = "Python";
        int  len = str.length();
        String sub = str.substring(len-3);
        System.out.println(sub+str+sub);
    }
}
