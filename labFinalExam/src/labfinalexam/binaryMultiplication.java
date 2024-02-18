/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labfinalexam;
import java.util.Scanner;
/**
 *
 * @author yasin
 */
public class binaryMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st binary : ");
        String  bin1 = sc.next();
        System.out.println("Enter 2nd binary : ");
        String bin2 = sc.next();
        
        int []arr1 = new int[bin1.length()];
        int []arr2 = new int[bin2.length()];
        int []ans = new int[bin1.length()+bin2.length()];
        
        //binary sting to array 
        for(int i=0;i<bin1.length();i++){
            arr1[i] = bin1.charAt(i)-'0';
        }
        
         //binary sting to array 
        for(int i=0;i<bin2.length();i++){
            arr2[i] = bin2.charAt(i)-'0';
        }
        
        //binary multiplicaiton:
        for(int i=arr1.length-1;i>=0;i--){
            for(int j=arr2.length-1;j>=0;j--){
                ans[i+j+1] += arr1[i]*arr2[j];
            }
        }
        
        for(int i=ans.length-1;i>=0;i--){
            if(ans[i]>=2){
                ans[i-1] += ans[i]/2;
                ans[i] = ans[i]%2;
            }
        }
        
     StringBuilder b = new StringBuilder();
     for(int k: ans){
        b.append(k);
     }
     while(b.length()>1 && b.charAt(0)=='0'){
         b.deleteCharAt(0);
     }
        System.out.println("ans : "+b);
    }
}
