/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author yasin
 */
public class oddAndEvenRearragne {
    public static void main(String[] args) {
         int []arr = {1,4,5,7,8,9,4,5,6,7,8,9,1,2,3,4,5};
         int [] out = new int[arr.length];
         int o=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]%2==1){
                out[o] = arr[i];
                o++;
            }
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]%2==0){
                out[o] = arr[i];
                o++;
            }
        }
        for(int k: out){
            System.out.print(" "+k);
        }
        System.out.println("");
    }
}
