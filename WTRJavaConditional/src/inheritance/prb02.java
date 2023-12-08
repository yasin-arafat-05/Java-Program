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
 Write a Java program to create a class called Vehicle with a method called drive().
 Create a subclass called Car that overrides the drive() method to print "Repairing a car".
*/
class Vehicle{
    void drive(){
        System.out.println("Driving");
    }
}

class Car extends Vehicle{
    
    @Override
    void drive(){
        System.out.println("Repairing a car");
    }
}
public class prb02 {
    public static void main(String[] args) {
        
    }
}
