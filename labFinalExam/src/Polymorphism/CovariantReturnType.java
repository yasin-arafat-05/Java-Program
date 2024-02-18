/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*

Before Java5, it was not possible to override any method by changing the return type. But now, 
since Java5, it is possible to override method by changing the return type if subclass overrides any method
whose return type is Non-Primitive but it changes its return type to subclass type. Let's take a simple example:

*/

package Polymorphism;

/**
 *
 * @author yasin
 */
class A5{
   A1 foo(){return this;}
    static void print(){System.out.println("In A1 class . . . ");}
}
    
class B1 extends A5{
    @Override
    B1 foo(){return this;}
    static void print(){System.out.println("In B1 class . . . ");
}
}    

public class CovariantReturnType {
    public static void main(String[] args) {
        B1 b = new B1();
        System.out.println("b: "+b.foo());
        B1.print();
        
        A5 a = new A5();
        System.out.println("b: "+a.foo());
        A5.print();
    }
}
