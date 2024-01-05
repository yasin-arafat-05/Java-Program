/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;

/*

6. (Constructor Failure) Write a program that shows a constructor passing information
about constructor failure to an exception handler. Define class SomeClass, which throws
an Exception in the constructor. Your program should try to create an object of type
SomeClass and catch the exception that’s thrown from the constructor.

*/

/**
 *
 * @author yasin
 */
/*

*/
class ConstructorFailureDemo{ 
    ConstructorFailureDemo() throws Exception{
        throw new Exception("This is Exception from Constructor..");
    } 
}

public class prbSIX {
    public static void main(String[] args) {
        try{
            ConstructorFailureDemo e = new ConstructorFailureDemo();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
