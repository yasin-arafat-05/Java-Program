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
public class octalToDec {
    public static void main(String[] args) {
        System.out.println("Enter a octal number : ");
        Scanner sc  = new Scanner(System.in);
        String n = sc.next();
        String oct = "01234567";
        int ans = 0,k=1;
        for(int i=n.length()-1;i>=0;i--){
           int index = oct.indexOf(n.charAt(i));
           ans +=(index*k);
           k *=8;
        }
        System.out.println("Ans: "+ans);
    }
}
