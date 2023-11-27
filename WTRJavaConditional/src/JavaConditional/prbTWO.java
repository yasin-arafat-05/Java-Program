/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaConditional;

/**
 *
 * @author yasin
 */
/*
Write a Java program to solve quadratic equations (use if, else if and else).

Test Data
Input a: 1
Input b: 5
Input c: 1
Expected Output :
The roots are -0.20871215252208009 and -4.7912878474779195
*/
import java.util.Scanner;
import java.lang.Math;
public class prbTWO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();
        
        int bSquare = (int) Math.pow(b,2);
        int diff = bSquare - (4*c*a);
        System.out.println(diff);
        float ans = -(float)b/ (2*(float)a);
        if(diff<0){
            System.out.println("No real root is present.");
        }else if(diff==0){
            System.out.println("Two root is equal: "+ans);
        }else{
            float ans1 = (float) (-b+Math.sqrt(diff))/(2*a);
            float ans2 = (float) (-b-Math.sqrt(diff))/(2*a);
            System.out.println("x: "+ans1+"  "+"y: "+ans2);
        }  
    }
}
