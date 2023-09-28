/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;
import java.lang.*;
/**
 *
 * @author yasin
 */
public class getPath {
 public static void main(String[] args)
 {
	// gets the value of the specified environment variable "PATH"
      System.out.println("\nEnvironment variable PATH: ");
      System.out.println(System.getenv("PATH"));

      // gets the value of the specified environment variable "TEMP"
      System.out.println("\nEnvironment variable TEMP: ");
      System.out.println(System.getenv("TEMP"));

      // gets the value of the specified environment variable "USERNAME"
      System.out.println("\nEnvironment variable USERNAME: ");
      System.out.println(System.getenv("USERNAME"));
  }
}
