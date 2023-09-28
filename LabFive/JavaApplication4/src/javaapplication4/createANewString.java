/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;
/**
 * @author yasin
 */
public class createANewString {
    public static void main(String[] args) {
       String s = "";
       int len = s.length();
       if(len==1){
           System.out.println(s+"##");
       }else if(len==2){
           System.out.println(s+"#");
       }else if(len==0){
           System.out.println("###");
       }else{
           System.out.println(s.substring(0, 3));
       }
    }
}
