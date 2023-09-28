/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 * @author yasin
 */
public class largerValueFromfristAndLast {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,10};
        int len = arr.length;
        if(arr[0]>arr[len-1]){
            System.out.println(arr[0]);
        }else{
            System.out.println(arr[len-1]);
        }
    }
}