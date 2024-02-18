/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MamAssignment.Inheritance;

/**
 *
 * @author yasin
 */
class One{
    void print(){
        System.out.println("This is parent class.");
    }
}

class Two extends One {
    
    void print_another(){
        System.out.println("This is child class.");
    }
}

public class prb01 {
    public static void main(String[] args) {
        One o = new One();
        o.print();
        
        Two t = new Two();
        t.print_another();
        t.print();
        
    }
}
