/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 * @author yasin
 */
public class largerValueFirstLastMiddle {
    public static void main(String[] args) {
        int []arr = {20, 30, 40, 50, 67};
        int len = arr.length;
        int mid = len/2;
        if(arr[0]>arr[mid] && arr[0]>arr[len-1]){
            System.out.println(" "+arr[0]);
        }
        else if(arr[mid]>arr[0] && arr[mid]>arr[len-1]){
            System.out.println(" "+arr[mid]);
        }
        else if(arr[len-1]>arr[mid] && arr[0]<arr[len-1]){
            System.out.println(" "+arr[len-1]);
        }
    }
}
