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
5. Write a Java program that takes a number from the user and 
generates an integer between 1 and 7.
It displays the weekday name.
Test Data
Input number: 3
Expected Output :
Wednesday
*/
import java.util.Scanner;
public class prbFIVE {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch(x){
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
            break;
            default : System.out.println("Not a valid number.");
        }
    }
}
