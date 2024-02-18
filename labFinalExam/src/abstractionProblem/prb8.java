/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractionProblem;

/**
 * @author yasin
 */

/*
Create an interface TVremote and use it to inherit another interface smart TVremote. 
Create a class TV which implements TVremote interface.
*/
interface TVremote{
   void powerON();
}

interface smartTVremote extends TVremote{
    void powerOFF();
}

class TV implements smartTVremote{
    
    @Override
    public void powerON(){
        System.out.println("TV is switching ON");
    }
    
    @Override
    public void powerOFF(){
        System.out.println("TV is switching OFF");
    }
    
}


public class prb8 {
    public static void main(String[] args) {
        TV newTV = new TV();
        newTV.powerON();
        newTV.powerOFF();
        System.out.println("");
    }
}
