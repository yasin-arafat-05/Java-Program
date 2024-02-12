/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labfinalexam;
import java.util.Scanner;
/**
 * @author yasin
 */

public class decimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number: ");
        int n = sc.nextInt();
        int ans = 0,i=1;
        while(n!=0){
            int rem = n%8;
            ans += (rem*i);
            i *=10;
            n/=8;
        }
        System.out.println("Decimal to octal: "+ ans);
    }
}
