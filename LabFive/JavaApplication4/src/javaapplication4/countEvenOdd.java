/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 * @author yasin
 */
public class countEvenOdd {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,10};
        int cntE = 0,cntO=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]%2==1){
                cntO++;
            }else{
                cntE++;
            }
        }
        System.out.println("Even: "+cntE+"\n Odd: "+cntO);
    }
 
}
