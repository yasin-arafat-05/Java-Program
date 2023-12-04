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
public class binaryAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String []s = str.split(" ");
        StringBuilder result = new StringBuilder();
       for(String temp : s){
           char firstChar = Character.toUpperCase(temp.charAt(0));
           result.append(firstChar).append(temp.substring(1)).append(" ");
       }
        System.out.println(result);
    }
}
