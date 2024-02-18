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
(Order of catch Blocks) Write a program that shows that the order of catch blocks is important.
If you try to catch a superclass exception type before a subclass type,
the compiler should generate errors.
*/

public class prb5 {
    public static void main(String[] args) {
        try{
            System.out.println(5/0);
        }catch (Exception e){
            System.out.println(e);
        }
//--------------can't reachable---------
//        catch (ArithmeticException e){
//            System.out.println(e);  
//        }

    }
}
