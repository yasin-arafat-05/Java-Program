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
public class decimalToHexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        long n = sc.nextLong();
        char []hexa ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String output = "";
        while(n>0){
            int index = (int) n%16;
            n/=16;
            output=hexa[index]+output;
        }
        System.out.println("Hexa: "+output);
        System.out.println("");
    }
}
