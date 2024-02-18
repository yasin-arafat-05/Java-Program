/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractionProblem;

/**
 * @author yasin
 */
/*
5. Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'.
Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' with a method 'dogs'
which prints "Dogs bark", both inheriting the class 'Animals'. Now create an object for each of the 
subclasses and call their respective methods.
*/
abstract class Animals{
    abstract void cats();
    abstract void dogs();
}

class Cats extends Animals{
    @Override
    void cats(){
        System.out.println("Cats meow");
    }
    @Override
    void dogs(){};
}

class Dogs extends Animals{
    @Override
    void cats(){}
    @Override
    void dogs(){System.out.println("Dogs bark");};
}

public class prb5 {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.dogs();
        
        System.out.println("");
        Cats c = new Cats();
        c.cats();
        
    }
}
