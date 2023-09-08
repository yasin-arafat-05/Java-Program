/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;
import java.util.Scanner;
/**
 * @author yasin
 */
public class addBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first binary number: ");
        int  a = sc.nextInt();
        System.out.println("Enter second binary number: ");
        int  b = sc.nextInt();
        int carry = 0;
        int []arr = new int[10];
        for(int  i = arr.length-1;i>=0;i--){
            int  digit1 = a%10;
            int digit2 = b%10;
            a=a/10;
            b=b/10;
            int sum = carry+digit1+digit2;
            if(sum==0){
                arr[i] = 0;
                carry = 0;
            }else if(sum==1){
                arr[i] = 1;
                carry = 0;
            }else if(sum==2){
                arr[i] = 0;
                carry = 1;
            }else if(sum==3){
                arr[i] = 1;
                carry = 1;
            }
        }
        //displaying the sum:
        for(long it : arr){
            System.out.print(it);
        }
        System.out.println("");
    }
}