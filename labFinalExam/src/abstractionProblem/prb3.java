/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractionProblem;

/**
 *
 * @author yasin
 */
/*
3.We have to calculate the percentage of marks obtained in three subjects (each out of 100)
by student A and in four subjects (each out of 100) by student B. Create an abstract class'Marks' with 
an abstract method 'getPercentage'. It is inherited by two other classes 
'A' and 'B' each having a method with the same name 
which returns the percentage of the students. 
The constructor of student A takes the marks in three subjects as its parameters 
and the marks in four subjects as its parameters for student B.
Create an object for eac of the two classes and print the percentage of marks for both the students.
*/
abstract class Marks{
    abstract void getPercentage();
}

class A extends Marks{

    int sub1,sub2,sub3,sub4;
    
    A(int sub1,int sub2,int sub3){
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        
    }
    
    @Override
    void getPercentage(){
         double percentage = (sub1+sub2+sub3);
         percentage = percentage/300d * 100;
        System.out.println("Percentange of A: "+percentage);
    }
}

class B extends Marks{

    int sub1,sub2,sub3,sub4;
    
    B(int sub1,int sub2,int sub3,int sub4){
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }
    
    @Override
    void getPercentage(){
         double percentage = ((sub1+sub2+sub3+sub4)/400d) * 100;
        System.out.println("Percentange of B: "+percentage);
    }
}


public class prb3 {
    public static void main(String[] args) {
        B b = new B(45,45,56,67);
        b.getPercentage();
        
        System.out.println("");
        
        
        A a = new A(78, 78, 90);
        a.getPercentage();
        System.out.println("");
        
    }
}
