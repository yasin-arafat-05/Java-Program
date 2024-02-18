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
    void eat(){System.out.println("Eating...");}
}

class Dog extends Animal{
    void bark(){System.out.println("Barking....");}
}

class BabyDog extends Dog{
    void weep(){System.out.println("Weeping");}
}
public class multipleInheritance {
    public static void main(String[] args) {
        BabyDog bd = new  BabyDog();
        bd.eat();
        bd.bark();
        bd.weep();
    }
}
