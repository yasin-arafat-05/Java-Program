/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;
/*
(Order of catch Blocks) Write a program that shows that the order of catch blocks is
important. If you try to catch a superclass exception type before a subclass type, the
compiler should generate errors.
*/
/**
 *
 * @author yasin
 */

public class prbFIVE {
    public static void main(String[] args) {
        int i = 5,j=0;
        try{
           int k = i/j;
        }catch(Exception e){
            System.out.println(""+e.getMessage());
            
            /*
            it showing error beacuse Eception is class and 
            IllegalStateException is sub class.
            If we run the program every time always catch the Exception class
            but never it can catch IllegalStateException class.
            */
            
        }catch(IllegalStateException e){
            System.out.println("NOT Correct Syntax.");
        }
    }
}
