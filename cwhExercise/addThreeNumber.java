package cwhExercise;

import java.util.Scanner;

class addThreeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println("Sum of "+a+"+"+b+"+"+c+"    =   "+sum);
        sc.close();
    }
}