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
public class decimalToHexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a deciamal number: ");
        int n = sc.nextInt();
        char []arr = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String ans = "";
        while(n!=0){
            int index = n%16;
            ans +=arr[index];
            n /=16;
        }
        System.out.println(ans);
    }
}
