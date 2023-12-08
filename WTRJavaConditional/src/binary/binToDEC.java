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
import java.lang.Math;

public class binToDEC {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();
        int ans = 0,i=0;
        while(bin!=0){
            int digit = bin%10;
            bin/=10;
            ans += Math.pow(2, i)*digit;
            i+=1;
        }
        System.out.println("result : "+ans);
    }
}

/*
 1 1 1 1 -> 15
 (1*1) + (2*1) + (4*1) + 8 = 15

 111 -> 7
 1000 = 8 
*/