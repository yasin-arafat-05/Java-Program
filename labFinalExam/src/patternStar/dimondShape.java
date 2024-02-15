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
public class dimondShape {
    public static void main(String[] args) {
        System.out.println("Enter the value of n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //-------upper part --------------
        for(int i=0;i<n;i++){
            //1st part:
            int space = n - i +1;
            while(space-->0){
                System.out.print(" ");
            }
            int start = i +1;
            while(start-->0){
                System.out.print("*");
            }
            
            // 2nd part:
            int secStart = i ;
            while(secStart-->0){
                System.out.print("*");
            }
            
            System.out.println("");
        }
        
        
         //-------lower part --------------
        for(int i=n;i>=0;i--){
            //1st part:
            int space = n - i +1;
            while(space-->0){
                System.out.print(" ");
            }
            int start = i +1;
            while(start-->0){
                System.out.print("*");
            }
            
            // 2nd part:
            int secStart = i ;
            while(secStart-->0){
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
}
