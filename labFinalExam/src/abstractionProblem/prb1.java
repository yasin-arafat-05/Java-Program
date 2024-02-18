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
1. Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method 
with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. 
Call the methods 'message' by creating an object for each subclass.
*/

abstract class Parent{
   abstract void message();
}

class First extends Parent{
    @Override
    void message(){
        System.out.println("This is first subclass");
    }
}

class Second extends Parent{
    @Override
    void message(){
        System.out.println("This is second subclass");
    }
}

public class prb1 {
    public static void main(String[] args) {
        First f = new First();
        f.message();
        System.out.println("");
        
        Second s = new Second();
        s.message();
        System.out.println("");
    }
}
