/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author yasin
 */
public class multipyCoresArray {
    public static void main(String[] args) {
        int []arr = {1, 3, -5, 4};
        int []arrT = {1, 4, -5, -2};
        int []newArray = new int[4];
        for(int i=0;i<arr.length;i++){
            newArray[i] = arr[i]*arrT[i];
        }
        for(int k:newArray){
            System.out.print(" "+k);
        }
        System.out.println(" ");
    }
}
