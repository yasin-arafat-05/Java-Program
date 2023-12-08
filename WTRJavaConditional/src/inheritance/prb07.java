/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yasin
 */

/*
Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle and
Square. Use Quadrilateral as the superclass of the hierarchy. Create and use a Point class to
represent the points in each shape. Make the hierarchy as deep (i.e., as many levels) as
possible. Specify the instance variables and methods for each class. The private instance
variables of Quadrilateral should be the x-y coordinate pairs for the four endpoints of the
Quadrilateral. Write a program that instantiates objects of your classes and outputs each
object’s area (except Quadrilateral).
*/

import java.lang.Math;

class Point{
    private int x;
    private int y;
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    //getter
    int getX(){
        return x;
    }
    int getY(){
        return y;
}
 
class Quadrilateral{
    private Point a;
    private Point b;
    private Point c;
    private Point d;
   
    Quadrilateral(Point a,Point b,Point c,Point d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    Point getA(){
    return a;
    }
    
    Point getB(){
    return b;
    }
    
    Point getC(){
    return c;
    }
    Point getD(){
    return a;
    }
      
    double A(){
        return (double) Math.sqrt(Math.pow((a.getX()-b.getX()), 2)+Math.pow((a.getY()-b.getY()), 2));
    }
    
    double B(){
        return (double) Math.sqrt(Math.pow((b.getX()-c.getX()), 2)+Math.pow((b.getY()-c.getY()), 2));
    }
    
    double C(){
        return (double) Math.sqrt(Math.pow((c.getX()-d.getX()), 2)+Math.pow((c.getY()-d.getY()), 2));
    }
    
    double D(){
        return (double) Math.sqrt(Math.pow((d.getX()-a.getX()), 2)+Math.pow((d.getY()-a.getY()), 2));
    }
    
}
    

class Trapezoid extends Quadrilateral{
    
    Trapezoid(Point a,Point b,Point c,Point d){
        super(a,b,c,d);
    } 
    double getArea(){
        return (double)0.5*(A()+C())*B();
    }
}

class Parallelogram extends Quadrilateral{
    
    Parallelogram(Point a,Point b,Point c,Point d){
        super(a,b,c,d);
    }
    double getArea(){
        return (double) (A()*B());
    }
}

class Rectangle extends Quadrilateral{
    
    Rectangle(Point a,Point b,Point c,Point d){
        super(a,b,c,d);
    }  
     double getArea(){
        return (double) (A()*B());
    }
}


class Square extends Quadrilateral{
    
    Square(Point a,Point b,Point c,Point d){
        super(a,b,c,d);
    } 
     double getArea(){
        return (double) (A()*B());
    }
}

public class prb07{
    public static void main(String[] args){
        Point a = new Point(0,0);
        Point b = new Point(0,5);
        Point c = new Point(5,5);
        Point d = new Point(5,0);
        
        Trapezoid trapezoid = new Trapezoid(a, b, c, d);
        Parallelogram parallelogram = new Parallelogram(a, b, c, d);
        Rectangle rectangle = new Rectangle(a, b, c, d);
        Square square = new Square(a, b, c, d);
        System.out.println("Area of Trapezoid: " + trapezoid.getArea()); 
        System.out.println("Area of Parallelogram: " + parallelogram.getArea());
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Area of Square: " + square.getArea());
    }
}
