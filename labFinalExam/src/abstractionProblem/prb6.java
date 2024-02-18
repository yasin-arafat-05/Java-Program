/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractionProblem;

/**
 * @author yasin
 */

/*
We have to calculate the area of a rectangle, a square and a circle. 
Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters,
'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, 
that of 'SquareArea' is its side and that of 'CircleArea' is its radius. 
Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and
'CircleArea' for printing the area of rectangle, square and circle respectively.
Create an object of class 'Area' and call all the three methods.
*/

interface  Shape{
    void RectangleArea(int l,int b);
    void SquareArea(int l);
    void CircleArea(double l);
}

class Area implements Shape{
 
    @Override
    public void RectangleArea(int l,int b){
        System.out.println("area of rectangle : "+(l*b));
    }
    
    @Override
    public void SquareArea(int l){
         System.out.println("area of SquareArea : "+(l*l));
    }
    
    @Override
    public void CircleArea(double l){
        double area = 2*Math.PI*l;
         System.out.println("area of Circle : "+area);
    }
}

public class prb6 {
    public static void main(String[] args) {
        Area ar = new Area();
        ar.CircleArea(5.0);
        ar.RectangleArea(5, 6);
        ar.SquareArea(6);
    }
}
