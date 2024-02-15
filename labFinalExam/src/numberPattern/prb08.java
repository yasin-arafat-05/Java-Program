/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numberPattern;

import java.util.Scanner;

/**
 *
 * @author yasin
 */
public class prb08 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            if(i%2==0){
                int m = 1;
                for(int j=0;j<n;j++){
                    System.out.print(m+" ");
                    m = (m==0)?1:0;
                }
            }else{
                int k = 0;
                for(int j=0;j<n;j++){
                System.out.print(k+" ");
                k = (k==0)?1:0;
            }
            }
            System.out.println("");
        }
    }
}
