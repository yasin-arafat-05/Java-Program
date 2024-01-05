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
(Rethrowing Exceptions) Write a program that illustrates rethrowing an exception. Define
methods someMethod and someMethod2. Method someMethod2 should initially throw
an exception. Method someMethod should call someMethod2, catch the exception and
rethrow it. Call someMethod from method main, and catch the rethrown exception. Print
the stack trace of this exception
*/
public class prbSEVEN{

    // Method that initially throws an exception
    static void someMethod2() throws Exception {
        System.out.println("someMethod2 is throwing an exception");
        throw new Exception("Original Exception");
    }

    // Method that calls someMethod2, catches the exception, and rethrows it
    static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            System.out.println("We are in another method -> Message From Orginal Methond "+e.getMessage());
            // Rethrow the caught exception
            throw e;
        }
    }

    // Main method to call someMethod and catch the rethrown exception
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
