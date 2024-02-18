/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 * @author yasin
 */

class Bank{
    int getRateOfInterest(){return 0;}
}

class SBI extends Bank{
    @Override
    int getRateOfInterest(){return 5;}
}

class CICI extends Bank{
    @Override
    int getRateOfInterest(){return 6;}
}

class AXIS extends Bank{
    @Override
    int getRateOfInterest(){return 7;}
}

public class MethodOverriding {
    public static void main(String[] args) {
        SBI s = new SBI();  
        CICI i = new CICI();  
        AXIS a = new AXIS();  
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
    }
}
