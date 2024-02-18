/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolymorphismProblem;

/**
 * @author yasin
 */

/*
2. Write a subclass called SubClass that is derived from SuperClass 
and that adds an integer data field called data2 and a public method called checkCondition()
that will check if data1 is equal to 10 and data2 is equal to 15, 
the checkCondition () method should return “Condition True!”.
Also, create methods called setData2() and getData2() for setting and retrieving 
the value of data1 and data2, as well as a constructor that accepts arguments 
for the starting values of data1 and data2. data1 is data member of SuperClass.
*/

class SuperClass{
    int data1;
     void setData1(int d){
        data1 = d;
    }
    int getData1(){
        return data1;
    }
}


class SubClass extends SuperClass{
    int data2;
    SubClass(int data1,int data2){
        this.data2 = data2;
        super.setData1(data2);
    }
    
    void setData2(int d){
        data2 = d;
    }
    int getData2(){
        return data2;
    }
    
    public void checkCondition(){
        if(getData2()==10 && getData1()==15){
            System.out.println("Condition True!.");
        }else{
            System.out.println("Condition Not Match");
        }
    }   
}


public class prb2 {
    public static void main(String[] args) {
        SubClass s = new SubClass(4, 4);
        s.checkCondition();
        s.setData1(15);
        s.setData2(10);
        s.checkCondition();
    }
}
