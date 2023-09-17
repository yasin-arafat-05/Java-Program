/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;
/**
 * @author yasin
 */
public class capitalizeSTR {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String out ="";
        System.out.println("Enter a string : ");
        String firstS = sc.nextLine();
        String []arr = firstS.split(" ");
        for(int i=0;i<arr.length;i++){
            out+= Character.toUpperCase(arr[i].charAt(0));
            out+=arr[i].substring(1)+" ";
            
        }
        System.out.println("OutPut: "+out);
    }
}