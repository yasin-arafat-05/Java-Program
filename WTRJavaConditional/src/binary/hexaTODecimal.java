/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binary;

/**
 *
 * @author yasin
 */
import java.util.Scanner;
public class hexaTODecimal {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hexadecimal number: ");
        String hexString = sc.nextLine();
        sc.close();

        // Converting hexadecimal to decimal
        String hex = "0123456789ABCDEF";
        int decimal = 0;
        for(int i=0;i<hexString.length();i++){
            char hexChar = hexString.charAt(i);
            int index = hex.indexOf(hexChar);
            decimal = (decimal * 16) + index;
        }
            System.out.println("Ans: "+decimal);
    }
}
