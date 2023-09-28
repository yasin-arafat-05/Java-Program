/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 * @author yasin
 */
public class rotatedArray {
    public static void main(String[] args) {
        int []orginal = {20,30,40,50};
        int s = orginal.length;
        int []rotatedArray = new int[s];
        for(int i=1;i<s;i++){
            rotatedArray[i-1] = orginal[i];
        }
        rotatedArray[s-1] = orginal[0];
        for(int ele: rotatedArray){
            System.out.print(" "+ele);
        }
        System.out.println("");
    }
}
