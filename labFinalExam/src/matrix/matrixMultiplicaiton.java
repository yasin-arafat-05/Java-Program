/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;
import java.util.Scanner;
/**
 *
 * @author yasin
 */
public class matrixMultiplicaiton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of 1st matrix: ");
        int r1 = sc.nextInt();
        System.out.println("Enter the column of 1st matrix: ");
        int c1 = sc.nextInt();
        
        System.out.println("Enter the row of 2st matrix: ");
        int r2 = sc.nextInt();
        System.out.println("Enter the column of 2st matrix: ");
        int c2 = sc.nextInt();
        
        
        if(c1!=r2){
            System.out.println("Matrix multtiplicition is not possible");
        }
        //----------------------Dleclear array for matrix---------------------
        
        int [][]mat1 = new int[r1][c1];
        int [][]mat2 = new int[r2][c2];
        
        int [][]ans = new int[r1][c2];
        
        //-----------------Taking input----------------------
        //-1st matrix
        System.out.println("Enter 1st matrix: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
               mat1[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("1st matrix: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print( mat1[i][j]+" ");
            }
            System.out.println("");
        }
        
        //-2nd matrix-
        System.out.println("Enter 2nd matrix: ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
               mat2[i][j] = sc.nextInt();
            }
        }
        
         System.out.println("2nd matrix: ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                System.out.print( mat2[i][j]+" ");
            }
            System.out.println("");
        }
        
        
        //-----------multiplicaiton------------
        //-1st matrix
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
              int sum=0;
              for(int k=0;k<c1;k++){
                  sum += mat1[i][k]*mat2[k][j];
                }
              ans[i][j] = sum;
            }
        }
        //-show the  matrix-
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println("");
        }
        
        
        
    }
}
