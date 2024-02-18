/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractionAndInterFace;

/**
 *
 * @author yasin
 */
interface Drawable{
    void draw();
    
}

class Rectangle implements Drawable{
    
    @Override
    public void draw(){
        System.out.println("Rectangle is drawing.");
      }
}

class Circle implements Drawable{
    @Override
    public void draw(){
        System.out.println("Circle is drawing.");
    }
}


public class Interface {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.draw();
        Circle c = new Circle();
        c.draw();
    }
}
