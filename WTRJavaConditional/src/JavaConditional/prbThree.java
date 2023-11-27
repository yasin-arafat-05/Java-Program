/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaConditional;

/**
 *
 * @author yasin
 */
/*
3. Write a Java program that takes three numbers from the user and prints the greatest number.

Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87
*/
import java.util.Scanner;
public class prbThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x>y && x>z){
            System.out.println("Greatest : "+x);
        }else if(y>x && y>z){
            System.out.println("Greatest : "+y);
        }else{
            System.out.println("Greatest : "+z);
        }
    }
}
