/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labfinalexam;
import java.util.Scanner;
/**
 *
 * @author yasin
 */
public class hexaToDec {
    public static void main(String[] args) {
        System.out.println("Enter a hexadecimal number : ");
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int ans = 0,k=1;
        String hex = "0123456789ABCDEF";
        for(int i=num.length()-1;i>=0;i--){
            int index = hex.indexOf(num.charAt(i));
            ans += index*k;
            k *= 16;
        }
        System.out.println("Ans is : "+ans);
    }
}
