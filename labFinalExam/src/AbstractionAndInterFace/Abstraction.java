/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractionAndInterFace;

/**
 *
 * @author yasin
 */

abstract class Bike{
    Bike(){System.out.println("Bike is created.");}
    abstract void run(int speed);
    void gear(){
        System.out.println("Gear is changing.");
    }
}

class Honda extends Bike{
    @Override
    void run(int speed){
        System.out.println("Bike running safely.. at "+speed);
    }
}


public class Abstraction {
    public static void main(String []args){
        Honda hd = new Honda();
        hd.run(20);
        hd.gear();
    }
}
