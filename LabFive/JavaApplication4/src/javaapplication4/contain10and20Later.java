/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author yasin
 */
public class contain10and20Later {
    public static void main(String[] args) {
        int f = 0,s=0;
           int []arr = {1,2,3,4,10,2343,343,434,20,1,2,3,3};
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]==10){
                    f = 1;
                }else if(arr[i]==20){
                    s = 2;
                }
            }
            if(f==1 && s==2){
                System.out.println("Found");
            }else{
                System.out.println("Not Found");
            }
    }
}