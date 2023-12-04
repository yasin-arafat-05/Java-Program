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
public class decToHexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number : ");
        int n = sc.nextInt();
        sc.close();
        
        char []hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        String ans = "";
        while(n>0){
            ans = hex[n%16]+ans;
            n/=16;
        }
        System.out.println(ans);
    }
}
