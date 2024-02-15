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
public class rightDownMirrorStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int space = i;
            while(space-->0){
                System.out.print(" ");
            }
            int star = n-i;
            while(star-->0){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
