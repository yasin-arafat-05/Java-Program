/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Problem statemnet: 
/*
1. Write a Java program to get a number from the user and print whether it is positive or negative.

Test Data
Input number: 35
Expected Output :
Number is positive
*/
import java.util.Scanner;
package JavaConditional;

/**
 *
 * @author yasin
 */
public class prbONE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        if(x>0){
            System.out.println("Positive");
        }else if(x<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }    
        
    }
}