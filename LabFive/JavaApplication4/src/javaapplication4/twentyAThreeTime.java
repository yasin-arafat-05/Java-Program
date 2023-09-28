/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author yasin
 */
public class twentyAThreeTime {
    public static void main(String[] args) {
        int []arr = {1,20,3,20,20,1,2,3,3,20,23,20};
        int cntT = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==20 && arr[i+1]!=20){
                cntT++;
            }
        }
        if(cntT==3){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
