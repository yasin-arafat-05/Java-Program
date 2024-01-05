/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Problem Number:01
Write a java program using multiple catch blocks. Create a class CatchExercise inside the
try block declare an array a[] and initialize with value a[5] =30/5; . In each catch block
show Arithmetic exception and ArrayIndexOutOfBoundsException.
Test Data:
a[5] =30/5;
Expected Output :
ArrayIndexOutOfBoundsException occurs
Rest of the code
*/

package exceptionhandling;

/**
 *
 * @author yasin
 */
class  CatchExercise{
     
     CatchExercise(){
    try {
            int[] arr = new int[5];
                arr[5] = 30 / 5;
            } catch (ArithmeticException e){
                System.out.println("Arithmetic Exception occurs: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException occurs: " + e.getMessage());
            } catch (Exception e){
                System.out.println("This is a normal exception");
            }
 // Here ArithmeticException,ArrayIndexOUtOfBoundsException is sub class of Exception that's why it always given in last.
     }

 }
//-----------------------Main Class------------------------------
public class prbONE {
    public static void main(String[] args) {
        CatchExercise df = new CatchExercise();
    }
}
