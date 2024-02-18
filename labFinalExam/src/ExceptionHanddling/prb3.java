/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHanddling;

/**
 * @author yasin
 */

/*
 (Catching Exceptions with Superclasses) Use inheritance to create an exception 
 superclass (called ExceptionA) and exception subclasses ExceptionB and ExceptionC,
 where ExceptionB inherits from ExceptionA and ExceptionC inherits from ExceptionB.

 Write a program to demonstrate that the catch block for type ExceptionA 
 catches exceptions of types ExceptionB and ExceptionC.
*/
class ExceptionA extends Exception{
    ExceptionA(String message){
        super(message);
    }
}

class ExceptionB extends ExceptionA{
    ExceptionB(String message){
        super(message);
    }
}

class ExceptionC extends ExceptionB{
    ExceptionC(String message){
        super(message);
    }
}


public class prb3 {
    public static void main(String[] args) {
        try{
            throw new ExceptionB("this is exception B");
        }catch(ExceptionA e){
            System.out.println(e);
        }
        
        try{
            throw new ExceptionC("this is exception C");
        }catch(ExceptionA e){
            System.out.println(e);
        }
    }
}
