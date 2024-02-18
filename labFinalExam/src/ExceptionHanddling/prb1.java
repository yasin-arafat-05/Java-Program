/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHanddling;

/**
 * @author yasin
 */
/*
1.Write a java program using multiple catch blocks. 
Create a class CatchExercise inside the try block declare an array a[] 
and initialize with value a[5] =30/5; . In each catch block show Arithmetic 
exception and ArrayIndexOutOfBoundsException.

 Test Data:
 a[5] =30/5;
 Expected Output :
 ArrayIndexOutOfBoundsException occurs
 Rest of the code
*/
class CatchExercise{
   static void exception(){
            try{
                double []arr = new double[5];
                arr[5] = 30/5;
            }catch(ArithmeticException e){
                System.out.println(e);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
    }

public class prb1 {
    public static void main(String[] args) {
        CatchExercise.exception();
    }
}
