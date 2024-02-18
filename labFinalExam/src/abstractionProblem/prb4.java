/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractionProblem;

/**
 *
 * @author yasin
 */
/*
 4. An abstract class has a construtor which prints "This is constructor of abstract class", 
an abstract method named 'a_method' and a non-abstract method which prints 
"This is a normal method of abstract class". A class 'SubClass' inherits the abstract class 
and has a method named 'a_method' which prints "This is abstract method". 
Now create an object of 'SubClass' and call the abstract method and the non-abstract method. (Analyse the result)
*/

abstract class Test{
    Test(){
        System.out.println("This is constrctor of abstract class");
    }
    abstract void a_method();
    void traverse(){
        System.out.println("This is a normal method of abstract class");
    }
}

class SubClass extends Test{
    @Override
   void a_method(){
        System.out.println("This is abstract method");
   } 
}

public class prb4 {
    public static void main(String[] args) {
        SubClass k  = new SubClass();
        k.a_method();
        System.out.println("");
        k.traverse();
    }
}
