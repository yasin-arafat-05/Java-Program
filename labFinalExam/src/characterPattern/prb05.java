/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package characterPattern;
import java.util.Scanner;
/**
 *
 * @author yasin
 */
public class prb05 {
    public static void main(String[] args) {
        System.out.println("Enter a character between (A~Z) : ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        
        int n = (int)ch - (int)'A';
        char p = 'A';
            
        for(int i=0;i<=n;i++){
         
            //______________space___________________ 
            int space = n - i;
            while(space-->0){
                System.out.print(" ");
            }
            
            //---------print one letter----------- 
            
            System.out.print(p+" ");
           
          
            //-----------again space------------------
            int spaceTwo = i;
            while(spaceTwo-->1){
                System.out.print(" ");
            }
            int spaceThree = i-1;
           while(spaceThree-->0){
                System.out.print(" ");
            }
           
           //---------print one letter----------- 
           if(i!=0){
           System.out.print(p+" ");
           }
           p = (char) (p+1);
           
           System.out.println("");
        }   
        
        p = (char) (p-2);
        //-----------reverse the process--------------
         for(int i=n-1;i>=0;i--){
            
            //______________space___________________ 
            int space = n - i;
            while(space-->0){
                System.out.print(" ");
            }
            
            //---------print one letter----------- 
            
            System.out.print(p+" ");
           
          
            //-----------again space------------------
            int spaceTwo = i;
            while(spaceTwo-->1){
                System.out.print(" ");
            }
            int spaceThree = i-1;
           while(spaceThree-->0){
                System.out.print(" ");
            }
           
           //---------print one letter----------- 
           if(i!=0){
           System.out.print(p+" ");
           }
            p = (char) (p-1);
           
           System.out.println("");
        }
    } 
}
