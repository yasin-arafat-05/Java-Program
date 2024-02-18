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
public class prb21 {
    public static void main(String[] args) {
        
        System.out.println("Enter the vaule of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //------------------------------1st part--------------------------------
        for(int i=0;i<n;i++){
            
            //----------1st part ----1st half-----------
            int num = n;
            for(int j=0;j<n;j++){
                
                 System.out.print(num+" ");
                 
                if(j<i){
                    num = num - 1;
                }
               
            }
            
            //----------1st part ----second half-----------
            int numTwo = n-i;
            for(int j=0;j<n;j++){
                if(j!=0){
                     System.out.print(numTwo+" ");  
                }
                if(j>(n-2-i)){
                    numTwo = numTwo + 1;
                }
            }
            
            System.out.println("");
        }
        
        //-----------------2nd part-------------------
        for(int i=n-2;i>=0;i--){
            
            //----------1st part ----1st half-----------
            int num = n;
            for(int j=0;j<n;j++){
                
                 System.out.print(num+" ");
                 
                if(j<i){
                    num = num - 1;
                }
               
            }
            
            //----------1st part ----second half-----------
            int numTwo = n-i;
            for(int j=0;j<n;j++){
                if(j!=0){
                     System.out.print(numTwo+" ");  
                }
                if(j>(n-2-i)){
                    numTwo = numTwo + 1;
                }
            }
            
            System.out.println("");
        }
    }
}
