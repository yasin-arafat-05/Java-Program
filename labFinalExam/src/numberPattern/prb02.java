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
public class prb02 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 1;
        for(int i=0;i<n;i++){
            for(int k=0;k<=i;k++){
                System.out.print(m+" "); 
                m++;
            }
            System.out.println("");
        }
    }
}
