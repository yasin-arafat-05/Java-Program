/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author yasin
 */
import java.util.Scanner;
public class packpack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Matric row and column: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int [][]one = new int[r1][c1];
        System.out.println("Enter first matrix: ");
        for(int i=0;i<one.length;i++){
            for(int j=0;j<one[0].length;j++){
                one[i][j] = sc.nextInt();
            }
        }
        
        
        System.out.println("Enter the second Matric row and column: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int [][]two = new int[r2][c2];
        System.out.println("Enter second matrix: ");
        for(int i=0;i<two.length;i++){
            for(int j=0;j<two[0].length;j++){
                two[i][j] = sc.nextInt();
            }
        }
        
        if(r2!=c1){
            System.out.println("Not a valid Operation.");
            return;
        }
        System.out.println("Result: ");
        
        int [][]result = new int[r1][c2];
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                for(int k=0;k<c1;k++){
                      result[i][j] += one[i][k] * two[k][j];
                   }
            }  
         }
        
        //print the ans
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
