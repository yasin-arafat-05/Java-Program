/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labfinalexam;
import java.util.Scanner;
/**
 *
 * @author yasin
 */
public class addTwoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd binary number: ");
        int b = sc.nextInt();
        
        //convert into binary array : 
        int []ans = new int[10];
        
        int carry = 0,i=0;
        
        while(a!=0 || b!=0){
            ans[i] = (int) (a%10 + b%10 + carry )/2;
            i++;
            carry = (int) (a%10 + b%10 + carry )%2;
            a /=10;
            b /=10;   
        }
        
        if(carry!=0){
                ans[i] = carry;
                 i++;      
            }
        
        while(i>=0){
            System.out.print(ans[i]);
                 i--;
        }
        
    }
}
