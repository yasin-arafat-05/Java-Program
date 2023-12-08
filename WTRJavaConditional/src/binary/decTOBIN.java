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
public class decTOBIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long dec = sc.nextInt();
        long result = 0, i = 1;
        while(dec!=0){
            long digit = dec%2;
            dec/=2;
            result = result + (digit*i);
            i*=10;
        }
        
        System.out.println("Result: "+result);
    }
}
