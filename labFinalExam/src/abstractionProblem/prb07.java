/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractionProblem;
import java.util.Scanner;
/**
 * @author yasin
 */
/*
 Repeat the above question(Question no:06) for 4 rectangles, 4 squares and 5 circles. Hint- Use array of objects.
*/

public class prb07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rectangles");
        int n = sc.nextInt();
        
        System.out.println("Enter the number of square");
        int s = sc.nextInt();
        
        int [][]rec = new int[n][2];
        int []sqr = new int[s];
        
        for(int i=0;i<n;i++){
            System.out.println("give the length and width of "+(i+1)+" Rectangle : ");
            for(int j=0;j<2;j++){
                rec[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("");
        System.out.println("");
        
        for(int i=0;i<s;i++){
            System.out.println("give the side of "+(i+1)+" Square : ");
            sqr[i] = sc.nextInt();
        }
        
        System.out.println("");
        System.out.println("");
        
        
         Area ar = new Area();
         
         
        for(int i=0;i<n;i++){
            System.out.println("Area of"+ (i+1) +"Rectangle: ");
            for(int j=0;j<1;j++){
                ar.RectangleArea(rec[i][j],rec[i][j+1]);
            }
        }
    }
}
