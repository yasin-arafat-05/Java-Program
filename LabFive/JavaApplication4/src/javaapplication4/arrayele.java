/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author yasin
 */
public class arrayele {
    public static void main(String[] args) {
        int []arr = {10, 20, 10, 50, 20, 13, 50};
        int ans = 0;
        for(int i=0;i<arr.length-2;i++){
                if(arr[i]==arr[i+1] || arr[i] == arr[i+2]){
                ans = 1;
            }
        }
        if(ans==1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }   
    }
}