/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;
import java.util.Scanner;
/**
 *
 * @author yasin
 */
public class devide {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Two Number : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(b>a){
                a = a^b;
                b = b^a;
                a = a^b;
            }
            int ans = a/b;
        sc.close();
        System.out.println("result is = "+ans);
    }
}
