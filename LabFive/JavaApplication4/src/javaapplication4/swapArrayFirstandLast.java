/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 * @author yasin
 */
public class swapArrayFirstandLast {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,6,7,8,9,54,45,34};
        int len = arr.length;
        int temp = arr[0];
        arr[0] = arr[len-1];
        arr[len-1] = temp;
        for(int k: arr){
            System.out.print(" "+k);
        }
        System.out.println("    ");
    }
}