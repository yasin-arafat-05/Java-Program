/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;

/**
  Write a Java program to find the lexicographic rank of a given string.
Sample Output:The Given String is: BDCA
The Lexicographic rank of the given string is: 12

N.B.: Total possible permutations of BDCA are(lexicographic order) :
ABCD ABDC ACBD ACDB ADBC ADCB BACD BADC BCAD BCDA BDAC BDCA
1   2   3   4   5   6   7   8   9   10   11   12
The BDCA appear in 12 position of permutation (lexicographic order).
 */
public class prb50 {
    public static void main(String[] args) {
        String inputString = "BDCA";

        // Find the lexicographic rank of the given string
        System.out.println("The Given String is: " + inputString);
        int rank = findLexicographicRank(inputString);
        System.out.println("The Lexicographic rank of the given string is: " + rank);
    }

    private static int findLexicographicRank(String str) {
        int length = str.length();
        int rank = 1;
        int mul = factorial(length);

        for (int i = 0; i < length; i++) {
            mul /= (length - i);
            rank += findSmallerInRight(str, i, length - 1) * mul;
        }

        return rank;
    }

    private static int findSmallerInRight(String str, int low, int high) {
        int countRight = 0;

        for (int i = low + 1; i <= high; i++) {
            if (str.charAt(i) < str.charAt(low)) {
                countRight++;
            }
        }

        return countRight;
    }

    private static int factorial(int n) {
        return (n <= 1) ? 1 : n * factorial(n - 1);
    }
}
