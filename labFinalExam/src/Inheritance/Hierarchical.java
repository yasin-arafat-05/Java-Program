/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author yasin
 */

class Animal{
    void eat(){System.out.println("Eating . . . . ");}
}

class Dog extends Animal{
    void brak(){System.out.println("Braking . . . . ");}
}

class Cat extends Animal{
    void meew(){
        System.out.println("meaw meaw . . . . ");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.brak();
        
        Cat ct = new Cat();
        ct.meew();
    }
}
