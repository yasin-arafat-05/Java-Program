/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author yasin
 */
class Animal1{
    void eat(){System.out.println("Animal is eating . . . . ");}
}

class Dog1 extends Animal1{
    @Override
    void eat(){
        System.out.println("Dog is eating . . . . ");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Animal1 an = new Animal1();
        an.eat();
        
        Dog1  dg = new Dog1();
        dg.eat();
    }
}
