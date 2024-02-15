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
public class rightPascaleTriangle {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        //------1st part-----------
        for(int i=0;i<n;i++){
            int star = i+1;
            while(star-->0){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        //------2nd part-----------
        for(int i=n;i>=0;i--){
            int star = i+1;
            while(star-->0){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
   
}
