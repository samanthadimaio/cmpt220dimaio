/**
 * file: Lab4_prob3.java
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 4: Problem 7.9
 * due date: March 9, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 4 -  Problem 7.9 - Returns smallest value entered
 */
import java.util.Scanner;

public class Lab4_prob3 {
  public static void main(String[] args) {
  
    System.out.print("Enter 10 integers: ");
    Scanner input = new Scanner(System.in);
    double[] list = new double[10];  

    for (int k = 0; k < list.length; k++)
      list[k] = input.nextDouble();
      
    System.out.println("The smallest number is: " + min(list));
  }
  
  public static double min(double[] array) {
  
    double min = array[0];
    for (int i = 0; i < array.length; i++) {
      if (min > array[i])
        min = array[i];
    }
    return min;
  }
}