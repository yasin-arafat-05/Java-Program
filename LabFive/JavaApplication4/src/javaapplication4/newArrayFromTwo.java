/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author yasin
 */
public class newArrayFromTwo {
    public static void main(String[] args) {
        int []arr = {50,20,0};
        int []arrT = {5,-50,10};
        int []newArray = new int[2];
        newArray[0] = arr[0];
        newArray[1] = arrT[2];
        for(int k: newArray){
            System.out.print(" "+k);
        }
        System.out.println("");
    }
}
