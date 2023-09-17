/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
/**
 *
 * @author yasin
 */
public class sumOfPrime {
    static int primeNum(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return 0;
            }
        }
        
        return n;
    }
    public static void main(String[] args) {
        int sum=0,cnt=0;
        for(int i=2;i<=1000;i++){
            if(primeNum(i)!=0 && cnt!=100){
                sum+=primeNum(i); 
                cnt++;
            }
        }
        System.out.println("Sum of first 100 prime : "+sum);
    }
}