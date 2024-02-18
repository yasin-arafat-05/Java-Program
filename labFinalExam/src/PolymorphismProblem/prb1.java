/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolymorphismProblem;

/**
 * @author yasin
 */
/*
 1. Write a console based program to implement polymorphism using inheritance. 

Consider the example of Shape as base class with method show(). 
And then a child class Circle and Rectangle which inherit the base class Shape and override its method show().

Add one more Method with the name of getInfo(). This method would display the class name in which it is implemented. 
Do not override this method. When you will call the method getInfo() with child object 
it would still show the name of the base class, 
which implies that method has been directly inherited and was not overridden.
*/

class Shape{
    void show(){
        System.out.println("I am in Shape");
    }
    void getInfo(){
        System.out.println("Base class Shape");
    }
}

class Circle extends Shape{
    @Override
    void show(){
        System.out.println("This is Circle");
    }
  
}

class Rectangle extends Shape{
    @Override
    void show(){
        System.out.println("This is Rectangle");
    }
}



public class prb1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getInfo();
        r.show();
        
        System.out.println("");
        
        Circle c = new Circle();
        c.getInfo();
        c.show();
        
        System.out.println("");
        
        Shape s = new Shape();
        s.getInfo();
        s.show();
        
        System.out.println("");
    }
}
