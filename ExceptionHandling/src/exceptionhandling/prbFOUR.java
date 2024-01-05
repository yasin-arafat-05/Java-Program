/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;

/*
(Catching Exceptions Using Class Exception) Write a program that demonstrates how
various exceptions are caught with catch (Exception exception ) This time, define classes
ExceptionA (which inherits from class Exception) and ExceptionB (which inherits from
class ExceptionA). In your program, create try blocks that throw exceptions of types
ExceptionA, ExceptionB, NullPointerException and IOException. All exceptions should
be caught with catch blocks specifying type Exception.
*/
/**
 *
 * @author yasin
 */
import 
import java.io.IOException;
public class prbFOUR {
     public static void main(String[] args) {
         
//I'm working in same package that why i do not need to define ExceptionA(prb-03)
   
        try {
             throw new ExceptionA("ExceptionA occurred");
        } catch (ExceptionA e) {
            System.out.println("Caught ExceptionA: " + e.getMessage());
        } 
//I'm working in same package that why i do not need to define ExceptionA(prb-03)
        try{
            throw new ExceptionB("ExceptionB occurred");
        }catch (ExceptionB e) {
            System.out.println("Caught ExceptionB: " + e.getMessage());
        } 
        
        try{
            throw new IOException("This is IOException");
        }catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        } 
        
        
        try{
           throw new NullPointerException("This is NullPointerException"); 
        }catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
