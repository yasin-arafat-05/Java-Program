/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercisethree;
/**
 *
 * @author yasin
 */
public class divisiableByThreeAndFive {
 public static void main(String []args){
     for(int i=1;i<=100;i++){
         if(i%3==0 && i%5==0){
             System.out.print(i+" ");
         }
     }
     System.out.println("");
 }  
}
