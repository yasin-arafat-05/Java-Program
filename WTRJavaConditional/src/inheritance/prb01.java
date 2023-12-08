/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author yasin
 */
/*
1. Write a Java program to create a class called Animal with a method called makeSound(). 
Create a subclass called Cat that overrides the makeSound() method to bark.
/*

*/
class Animal{
    void makeSound(){
        System.out.println("sound");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("bark");
    }
}
public class prb01 {
    public static void main(String[] args) {
        Cat ob = new Cat();
        ob.makeSound();
        Animal an = new Animal();
        an.makeSound();
    }
}
