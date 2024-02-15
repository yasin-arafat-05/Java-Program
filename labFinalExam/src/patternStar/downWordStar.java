/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patternStar;
import java.util.Scanner;
/**
 *
 * @author yasin
 */
public class downWordStar {
    public static void main(String[] args) {
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            int star = n - i;
            while(star-->0){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
