/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 * @author yasin
 */
public class newStringFtwoString {
    public static void main(String[] args) {
        String str = "Python";
        String strT = "";
        int len1=str.length(),len2=strT.length();
        String out = "";
        if(len1==0){
            out+="#";
        }else{
            out +=str.charAt(0);
        }
        
        if(len2==0){
            out+="#";
        }else{
            out +=strT.charAt(0);
        }
        System.out.println("outptu: "+out);
    }
}
