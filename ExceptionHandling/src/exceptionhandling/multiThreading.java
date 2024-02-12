/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;

/**
 *
 * @author yasin
 */
class FirstLoop extends Thread{
   public  void run(){
        for(int i=0;i<=1000;i++){
            System.out.println("First-Loop: "+Thread.currentThread().getId()+" "+i);
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
class SecondLoop extends Thread{
     public  void run(){
        for(int i=0;i<=100;i++){
           System.out.println("Second-Loop: "+Thread.currentThread().getId()+" "+i);
           try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
class ThirdLoop extends Thread{
     public  void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Third-Loop: "+Thread.currentThread().getId()+" "+i);
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
class FourthLoop extends Thread{
     public  void run(){
        for(int i=0;i<=1;i++){
            System.out.println("Fourth-Loop: "+Thread.currentThread().getId()+" "+i);
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
public class multiThreading {
    public static void main(String[] args) throws InterruptedException {
        //create object: 
         FirstLoop first = new FirstLoop();
        SecondLoop second = new SecondLoop();
        ThirdLoop third = new ThirdLoop();
        FourthLoop fourth = new FourthLoop();

        // Start all threads without any sleep:
          first.start();

        second.start();

        third.start();

        fourth.start();
        
    }
}

