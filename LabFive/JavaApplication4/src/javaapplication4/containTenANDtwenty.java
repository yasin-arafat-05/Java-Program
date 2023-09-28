/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author yasin
 */
public class containTenANDtwenty {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,10,20,34};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==10 && arr[i+1]==20){
                System.out.println("Contain 10 and 20");
                break;
            }
        }
    }
}
