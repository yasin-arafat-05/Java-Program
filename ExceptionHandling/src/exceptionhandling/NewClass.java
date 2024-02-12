/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;

/**
 *
 * @author yasin
 */

class firstLoop extends Thread{
   public  void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Hello ");
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
class secondLoop extends Thread{
     public  void run(){
        for(int i=0;i<=5;i++){
           System.out.println("hi");
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}

public class NewClass {
    public static void main(String[] args) {
        
        firstLoop fl = new firstLoop();
        secondLoop sl = new secondLoop();
        
        fl.start();
        sl.start();
    }
}
