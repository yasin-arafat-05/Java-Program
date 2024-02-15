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
public class prb05 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            int k = (i+1);
           for(int j=1;j<=(i+1);j++){
               System.out.print(k+" ");
            }
            System.out.println("");
        }
    }
}
