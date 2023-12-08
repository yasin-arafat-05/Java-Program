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

public class octToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oct = sc.nextInt();
        int result = 0, i = 0;
        while(oct!=0){
            int digit = oct%10;
            oct /=10;
            result += ((int)Math.pow(8,i++))*digit;
        }
        System.out.println("Dec: "+result);
    }
}
