/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
(Catching Exceptions with Superclasses) Use inheritance to create an exception
superclass (called ExceptionA) and exception subclasses ExceptionB and ExceptionC,
where ExceptionB inherits from ExceptionA and ExceptionC inherits from ExceptionB.
Write a program to demonstrate that the catch block for type ExceptionA catches
exceptions of types ExceptionB and ExceptionC.
*/

package exceptionhandling;

/**
 *
 * @author yasin
 */
class ExceptionA extends Exception {
    public ExceptionA(String message) {
        super(message);
    }
}

class ExceptionB extends ExceptionA {
    public ExceptionB(String message) {
        super(message);
    }
}

class ExceptionC extends ExceptionB {
    public ExceptionC(String message) {
        super(message);
    }
}

public class prbTHREE {
    public static void main(String[] args) {
        try {
             throw new ExceptionA("ExceptionA occurred");
        } catch (ExceptionA e) {
            System.out.println("Caught ExceptionA: " + e.getMessage());
        } 
        try{
            throw new ExceptionB("ExceptionB occurred");
        }catch (ExceptionB e) {
            System.out.println("Caught ExceptionB: " + e.getMessage());
        } 
        
        try{
           throw new ExceptionC("ExceptionC occurred"); 
        }catch (ExceptionC e) {
            System.out.println("Caught ExceptionC: " + e.getMessage());
        }
    }
}

