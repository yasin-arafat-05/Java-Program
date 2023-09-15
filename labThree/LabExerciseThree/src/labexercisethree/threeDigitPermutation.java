/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercisethree;

/**
 *
 * @author yasin
 */
public class threeDigitPermutation {
    public static void main(String[] args) {
        int amount = 0;
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j <= 4; j++){
				for(int k = 1; k <= 4; k++){
					if(i != j && j != k && i != k){
						amount++;
						System.out.println(i + "" + j + "" + k);
					}
				}
            }
	}
	System.out.println("Total number of the three-digit-number is " + amount);
    }
}
