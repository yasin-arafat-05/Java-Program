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
public class leftTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
      
        for(int i =0;i<n;i++){
            
            //space 
            int space = n-i-1;
            while(space>0){
                System.out.print(" ");
                space--;
            }
            
             //star 
            int star = i+1;
            while(star>0){
                System.out.print("*");
                star--;
            }
            System.out.println("");
        }
        
        
    }
}
