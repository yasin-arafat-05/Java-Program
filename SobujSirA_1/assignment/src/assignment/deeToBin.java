/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;
import java.util.Scanner;
/**
 * @author yasin
 */

 public class deeToBin {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal Number: ");
        int a = sc.nextInt();
        int result = 0,i=1;
        while(a!=0){
            int element = a%2;
            a/=2;
            result = (result) + element*i;
            i *=10;
        }
       System.out.println("Binary "+" = "+result);
       sc.close();
    }
}
