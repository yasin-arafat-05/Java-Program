/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolymorphismProblem;

/**
 *
 * @author yasin
 */

/*
Create a class named Pizza that stores information about a single pizza. 
It should contain the following:
Private instance variables to store the size of the pizza (either small, medium, or large),
the number of cheese toppings,
the number of pepperoni toppings, a
nd the number of ham toppings 
Constructor(s) that set all of the instance variables.

Public methods to get and set the instance variables.
A public method named calcCost( ) that returns a double that is the cost of the pizza. 
Pizza cost is determined by: 
Small: $10 + $2 per topping Medium: $12 + $2 per topping Large: $14 + $2 per topping 
public method named getDescription( ) that returns a String containing the pizza size, quantity of each topping.
Write test code to create several pizzas and output their descriptions.

For example, a large pizza with one cheese, one pepperoni and two ham toppings should cost a total of $22. 
Now Create a PizzaOrder class that allows up to three pizzas to be saved in an order. 
Each pizza saved should be a Pizza object. 
Create a method calcTotal() that returns the cost of order. 
In the runner order two pizzas and return the total cost.
*/

class Pizza{
  private String pizaSize;
  private int chesseToppings,pepperoniToppings,hamToppings;
    public Pizza(String pizaSize, int chesseToppings, int pepperoniToppings, int hamToppings) {
        this.chesseToppings = chesseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
        if(pizaSize.equalsIgnoreCase("small") || pizaSize.equalsIgnoreCase("medium") || pizaSize.equalsIgnoreCase("large")){
            this.pizaSize = pizaSize;
        }else{
            System.out.println("Ivalid pizza size");
        }
    }
    
    
    public double calcCost(){
        double cost=0.0;
        if(getPizaSize().equalsIgnoreCase("small")){
            cost += 10; 
        }else if(getPizaSize().equalsIgnoreCase("medium")){
            cost += 12; 
        }else if(getPizaSize().equalsIgnoreCase("large")){
            cost += 14; 
        }
        cost += (getChesseToppings()+getPepperoniToppings()+gethumToppings())*2;
        return cost;
    }
    void getDescription(){
        System.out.println("Pizza Size: "+getPizaSize());
        System.out.println("Number of Chesse Toppings: "+ getChesseToppings());
        System.out.println("Number of Pepperoni Toppings: "+getPepperoniToppings());
        System.out.println("Number of Hum Toppings: "+gethumToppings());
        System.out.println("Total prize: "+ calcCost());
    }
    
    String getPizaSize(){
        return pizaSize;
    }
    
    int getChesseToppings(){
        return chesseToppings;
    }
    
    int getPepperoniToppings(){
        return pepperoniToppings;
    }
    int gethumToppings(){
        return  hamToppings;
    }

}


//-----------------------MAIN CLASS------------------------
public class prb3 {
    public static void main(String[] args) {
        Pizza pz = new Pizza("large", 1, 1, 2);
        pz.getDescription();
    }
}
