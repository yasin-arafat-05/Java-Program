/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHanddling;

/**
 *
 * @author yasin
 */
/*
 (Catching Exceptions Using Class Exception) Write a program that demonstrates 
how various exceptions are caught with catch (Exception exception ) This time, 
define classes ExceptionA (which inherits from class Exception) and ExceptionB 
(which inherits from class ExceptionA). In your program,
create try blocks that throw exceptions of types.
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

public class prb4 {
    public static void main(String[] args) {
        try{
            throw new ExceptionA("this is exception A");
        }catch(Exception e){
            System.out.println(e);
        }
        
         try{
            throw new ExceptionB("this is exception B");
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
