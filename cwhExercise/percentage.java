package cwhExercise;

import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter marks of five subjects: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int avg = (a+b+c+d+e)/5;
        sc.close();
           if(a>100 || b>100 || c>100 || d>100 || e>100){
                System.out.println("Invalid Number");
                return ; 
           }else{
                System.out.println("the average = "+avg);
           }
           
    }
}