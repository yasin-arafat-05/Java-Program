/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MamAssignment.Inheritance;

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
class Point{
   private int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    int getX(){
        return x;
    }
    
    int getY(){
        return y;
    }
}

class Quadrilateral{
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    
    Point getP1(){
        return p1;
    }
    
    Point getP2(){
        return p2;
    }
    
    Point getP3(){
        return p3;
    }
    
    Point getP4(){
        return p4;
    }
    
    double A(){
        return Math.sqrt(Math.pow(getP1().getX()-getP2().getX(),2) + Math.pow(getP1().getY()-getP2().getY(),2));
    }
    
    
    double B(){
        return Math.sqrt(Math.pow(getP2().getX()-getP3().getX(),2) + Math.pow(getP2().getY()-getP3().getY(),2));
    }
    
    
    double C(){
        return Math.sqrt(Math.pow(getP3().getX()-getP4().getX(),2) + Math.pow(getP3().getY()-getP4().getY(),2));
    }
    
    
    double D(){
        return Math.sqrt(Math.pow(getP1().getX()-getP4().getX(),2) + Math.pow( getP1().getY()-getP4().getY(),2));
    }
    
}


class Trapezoid extends Quadrilateral{
   
    public Trapezoid(Point p1,Point p2,Point p3,Point p4) {
        super(p1, p2, p3, p4);
    }
    
    void area(){
        double area = 0.5*(A()+C())*B();
         System.out.println("Area of Trapezoid is: "+area);
    }
}

class Parallelogram extends Quadrilateral{
    public Parallelogram(Point p1,Point p2,Point p3,Point p4) {
        super(p1, p2, p3, p4);
    }
    
    void area(){
        double area = (A()*B());
        System.out.println("Area of Parallelogram is: "+area);
    }
}

class Rectangle extends Quadrilateral{
    public Rectangle(Point p1,Point p2,Point p3,Point p4) {
        super(p1, p2, p3, p4);
    }
    
    void area(){
        double area = (A()*B());
        System.out.println("Area of Rectangle is: "+area);
    }
}

class Square extends Quadrilateral{
 
    public Square(Point p1,Point p2,Point p3,Point p4) {
        super(p1, p2, p3, p4);
    }
    
    void area(){
        double area = (A()*B());
        System.out.println("Area of Square is: "+area);
    }
}




public class prb07 {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(5,6);
        Point p3 = new Point(8,9);
        Point p4 = new Point(12,15);
        
        Square s = new Square(p1, p2, p3, p4);
        s.area();
        System.out.println("");
        
        
        Rectangle r = new Rectangle(p1, p2, p3, p4);
        r.area();
        System.out.println("");
       
        
        Parallelogram p = new Parallelogram(p1, p2, p3, p4);
        p.area();
        System.out.println("");
        
        
        Trapezoid t = new Trapezoid(p1, p2, p3, p4);
        t.area();
        System.out.println("");
        
    }
}
