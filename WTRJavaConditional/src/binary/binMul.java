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
public class binMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first binary number: ");
        String bin1 = sc.next();
        
        System.out.println("Enter second binary number: ");
        String bin2 = sc.next();
        
        //find the length
        int len1 = bin1.length();
        int len2 = bin2.length();
        
        //declear and initialize array
        int []bin1arr = new int[len1];
        int []bin2arr = new int[len2];
        
        int []result = new int[len1+len2];
        
        //convert binary str to int array
        for(int i=0;i<len1;i++){
            bin1arr[i] = bin1.charAt(i)-'0';
        }
        
        for(int i=0;i<len2;i++){
            bin2arr[i] = bin1.charAt(i)-'0';
        }
        
        //perform binary multiplication:
        for(int i=len1-1;i>=0;i--){
            for(int j=len2-1;j>=0;j--){
                result[i+j+1] += bin1arr[i]*bin2arr[j];
            }
        }
        
        // greater than or equal to 2;
        for(int i=result.length-1;i>=0;i--){
            if(result[i]>=2){
                result[i-1] = result[i]/2;
                result[i]%=2;
            }
        }
        
        StringBuilder builder = new StringBuilder();
        for(int k : result){
            builder.append(k);
        }
        
        while( (builder.length()>1) && (builder.charAt(0)=='0')){
            builder.deleteCharAt(0);
        }
        
        System.out.println(builder);
    }
}

