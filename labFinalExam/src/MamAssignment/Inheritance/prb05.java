/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MamAssignment.Inheritance;
import java.util.Scanner;
/**
 *
 * @author yasin
 */
public class prb05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println("Enter "+n + " value of");
        int []val = new int[n];
        
        for(int i=0;i<n;i++){
            val[i] = sc.nextInt();
        }
        
        int c = 1;
        for(int k: val){
        System.out.println("square no. "+c+" ");
        Square s = new Square(k);
        s.Area();
        s.Perimeter();
         System.out.println("");
        }     
        
    }
}
