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
public class prb04 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            //------space----------
            int space = n - i -1;
            while(space-->0){
                System.out.print(" ");
            }
            //-----char-----------
            char ch = 'A';
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch = (char) (ch+1);
            }
            
            System.out.println("");
        }
    }
}
