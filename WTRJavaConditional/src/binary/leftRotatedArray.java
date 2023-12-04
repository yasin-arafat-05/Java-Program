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

public class leftRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter the element of an array: ");
        int []arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        
        System.out.println("Enter the number of K(leftRotaiton): ");
        int k = sc.nextInt();
        
        sc.close();
        
        
        int []newarr = new int[n];
        int index = 0;
        
        for(int i=k;i<n;i++){
            newarr[index] = arr[i];
            index+=1;
        }
        
        for(int i=0;i<k;i++){
            newarr[index] = arr[i];
            index+=1;
        }
        
        for(int ans : newarr){
            System.out.print(ans);
        }
    }
}
