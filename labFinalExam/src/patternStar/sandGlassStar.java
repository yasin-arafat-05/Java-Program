/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patternStar;
import java.util.Scanner;
/**
 *
 * @author yasin
 */
public class sandGlassStar {
    public static void main(String[] args) {
        System.out.println("Enter the value of n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //-----------fist part----------------
         for(int i=0;i<n;i++){
            int star = n - i;
            int space = i;
         
             while(space-->0){
                System.out.print(" ");
            }
             
            while(star-->0){
                System.out.print(" *");
            }
           
            
            System.out.println("");
        }
         //----------------second part----------------
        for(int i=0;i<n;i++){
            int space = n - i -1;
            while(space-->0){
                System.out.print(" ");
            }
            int star = i+1;
            while(star-->0){
                System.out.print(" *");
            }
            System.out.println("");
        }
        
        
    }
}
