/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;

/**
 *
 * @author yasin
 */
/*
    (Catching Exceptions Using Outer Scopes) Write a program showing that a method with
its own try block does not have to catch every possible error generated within the try.
Some exceptions can slip through to, and be handled in, other scopes.
*/

public class prbEIGHT {
    static void methodWithTryBlock() {
        try {
            // Some code that might throw an exception
            int result = 10 / 0; 
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException in methodWithTryBlock");
        } finally {
            System.out.println("Finally block in methodWithTryBlock");
        }
    }

    public static void main(String[] args) {
        try {
            methodWithTryBlock();
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException in main method. Printing stack trace:");
        } finally {
            System.out.println("Finally block in main method");
        }
    }
    
}
