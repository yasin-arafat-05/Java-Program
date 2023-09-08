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
public class multiplicationTable {
    public static void main(String []args){
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        long l = sc.nextLong();
        for(int i=1;i<=10;i++){
            System.out.println(l+" * "+i+" = "+(l*i));
        }
     sc.close();
    }
}
