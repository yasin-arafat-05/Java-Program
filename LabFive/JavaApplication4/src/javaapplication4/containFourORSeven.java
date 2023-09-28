/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author yasin
 */
public class containFourORSeven {
    public static void main(String[] args) {
        int []arr = {5,7};
        int ans = 0;
        for(int x:arr){
            if(x==5 || x==7){
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
