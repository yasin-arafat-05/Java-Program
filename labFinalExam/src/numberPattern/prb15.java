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
public class prb15 {
     public static void main(String[] args) {
        System.out.println("Enter the vaule of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            //---1st part0-----
            int k =1;
            for(int j=0;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            //------2nd part-------
            int nd = i;
            k = k -1;
            while(nd-->0){
                 k--;
                System.out.print(k+" ");
               
            }
            System.out.println("");
        }
    }
}
