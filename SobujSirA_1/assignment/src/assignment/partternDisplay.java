/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 * @author yasin
 */
public class partternDisplay {
    public static void main(String[] args) {
        for(int i=1;i<15;i++){
            for(int j=1;j<=20;j++){
                if(i%2==1 && j<=6 && i<=9){
                    System.out.print("* ");
            }else if(i%2==0 && j<=5 && i<=9){
                    System.out.print("* ");
            }else{
                System.out.print("= ");
            }
            }
            System.out.println();
        }
    }
}
