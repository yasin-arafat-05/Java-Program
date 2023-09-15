/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercisethree;
import java.util.Scanner;
/**
 * @author yasin
 */
public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        sc.close();
        if(x%1==1){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
1212