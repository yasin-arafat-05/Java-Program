/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 * @author yasin
 */

public class productTwoNumber {
        String multiPlication(String binaryA, String binaryB) {
        int lenA = binaryA.length();
        int lenB = binaryB.length();

        // Initialize an array to store the intermediate results.
        int[] result = new int[lenA + lenB];

        // Convert the binary strings to integer arrays.
        int[] numA = new int[lenA];
        int[] numB = new int[lenB];

        for (int i = 0; i < lenA; i++) {
            numA[i] = binaryA.charAt(i) - '0';
        }

        for (int i = 0; i < lenB; i++) {
            numB[i] = binaryB.charAt(i) - '0';
        }

        // Perform binary multiplication.
        for (int i = lenA - 1; i >= 0; i--) {
            for (int j = lenB - 1; j >= 0; j--) {
                result[i + j + 1] += numA[i] * numB[j];
            }
        }

        // Perform carry propagation.
        for (int i = result.length - 1; i > 0; i--) {
            if (result[i] >= 2) {
                result[i - 1] += result[i] / 2;
                result[i] %= 2;
            }
        }

        // Convert the result to a binary string.
        StringBuilder binaryResult = new StringBuilder();
        for (int num : result) {
            binaryResult.append(num);
        }

        // Remove leading zeros from the result.
        while (binaryResult.length() > 1 && binaryResult.charAt(0) == '0') {
            binaryResult.deleteCharAt(0);
        }

        return binaryResult.toString();
    }
            
    public static void main(String args[]){
        String a = "101";
        String b = "101";
        System.out.println("1st binary number: "+a);
        System.out.println("2nd binary number: "+b);
        productTwoNumber pd = new productTwoNumber();
        String ans = pd.multiPlication(a,b);
        System.out.println("Multiplication is : "+ans);
    }
}
