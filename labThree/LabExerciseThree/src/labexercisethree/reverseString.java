/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercisethree;
import java.util.Scanner;
/**
 *
 * @author yasin
 */
public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char []arr = s.toCharArray();
        for(int i=0,j=s.length()-1;i<=j;i++,j--){
            char c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
        }
        for(char i : arr){
            System.out.print(i);
        }
        System.out.println();
    }
}
