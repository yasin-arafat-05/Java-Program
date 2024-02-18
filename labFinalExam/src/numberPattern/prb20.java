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
public class prb20 {
     public static void main(String[] args) {
        System.out.println("Enter the vaule of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            int k = i+1;
            //---------- first part -----------
            for(int j=0;j<(n-i);j++){
                System.out.print(k+" ");
                k++;
            }
            
            int m = 1;
            for(int l=0;l<i;l++){
                System.out.print(m+" ");
                m++;
            }
            
            System.out.println("");
        }
    }
}
