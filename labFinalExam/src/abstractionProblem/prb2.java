/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractionProblem;

/**
 * @author yasin
 */

/*
Create an abstract class 'Bank' with an abstract method 'getBalance'. 
$100, $150 and $200 are deposited in banks A, B and C respectively.
'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having 
a method named 'getBalance'. Call this method by creating an object of each of the three classes.
*/

abstract class Bank{
    abstract void getBalance();
}

class BankA extends Bank{
    int deposit = 100;
    
    BankA(){
        System.out.println("Bank A is create with diposit $"+deposit);
    }
    @Override
    void getBalance(){
        System.out.println("Balance of Bank A is: "+deposit);
    }
}



class BankB extends Bank{
    int deposit = 150;
    
    BankB(){
        System.out.println("Bank B is create with diposit $"+deposit);
    }
    @Override
    void getBalance(){
        System.out.println("Balance of Bank B is: "+deposit);
    }
}



class BankC extends Bank{
    int deposit = 200;
    
    BankC(){
        System.out.println("Bank A is create with diposit $"+deposit);
    }
    @Override
    void getBalance(){
        System.out.println("Balance of Bank A is: "+deposit);
    }
}


public class prb2 {
    public static void main(String[] args) {
        BankC c = new BankC();
        c.getBalance();
        System.out.println("");
        
        BankB b = new BankB();
        b.getBalance();
        System.out.println("");
        
        BankA a = new BankA();
        a.getBalance();
        System.out.println("");
        
    }
}
