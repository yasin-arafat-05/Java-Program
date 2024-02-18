/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MamAssignment.Inheritance;

/**
 *
 * @author yasin
 */
class Rectangle{
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    
    void Area(){
        System.out.println("Area: "+(length*width));
    }
    
    void Perimeter(){
        System.out.println("Perimeter: "+(2*(length+width)));
    }
}

class Square extends Rectangle{
   
    Square(int side){
        super(side,side);
    }
}


public class prb04 {
    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println("_____________Square : _______________");
        s.Perimeter();
        s.Area();
        
        Rectangle r = new Rectangle(5,5);
        System.out.println("_________________ Rectangle : _______________");
        r.Perimeter();
        r.Area();
    }
}
