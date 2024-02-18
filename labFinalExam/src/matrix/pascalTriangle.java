/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;
import java.util.Scanner;
/**
 *
 * @author yasin
 */
public class pascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        
        System.out.println("");
        
        for(int i=0;i<n;i++){
            //spcae 
            int space = (n-i)*2;
            while(space-->0){
                System.out.print(" ");
            }
            //for co_effieience: 
            int coef = 1;
            for(int j=0;j<=i;j++){
                System.out.printf("%4d",coef);
                coef = coef * (i-j)/(j+1);
            }
            System.out.println("");
        }
    }
}
