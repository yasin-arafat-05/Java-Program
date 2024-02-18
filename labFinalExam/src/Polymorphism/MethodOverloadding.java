/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author yasin
 */
class Sum{
   static int sum(int a,int b){
        return a+b;
    }
   
   // method overloading by changing the parameter number:
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    
    // method overloading by changing the type of parameter:
    static int sum(char a,char b){
        return (int) (a+b);
    }
    
}
public class MethodOverloadding {
    public static void main(String[] args) {
      
        System.out.println(Sum.sum(5,6));
        
        System.out.println(Sum.sum(5, 7));
        
        System.out.println(Sum.sum(5, 5,5));
    }
}
