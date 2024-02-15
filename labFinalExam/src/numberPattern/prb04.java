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
public class prb04 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //------increasing order--------
        for(int i=0;i<n;i++){
            //space 
            int space = n - i -1;
            while(space-->0){
                System.out.print(" ");
            }
                 
             // decreasing numbers
            int secNumb = i+1;
            while (secNumb > 0) {
                System.out.print(secNumb);
                secNumb--;
            }
            
            // increasing numbers
            int numb = 2;
            while (numb <= i + 1) {
                System.out.print(numb);
                numb++;
            }
            System.out.println("");
        }
          
        
         //------reverse order--------
        for(int i=n-2;i>=0;i--){
            //space 
            int space = n - i -1;
            while(space-->0){
                System.out.print(" ");
            }
                 
             // decreasing numbers
            int secNumb = i+1;
            while (secNumb > 0) {
                System.out.print(secNumb);
                secNumb--;
            }
            
            // increasing numbers
            int numb = 2;
            while (numb <= i + 1) {
                System.out.print(numb);
                numb++;
            }
            System.out.println("");
        }
    }
}
