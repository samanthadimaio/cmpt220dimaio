/**
 * file: Lab4_prob1.java
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 4: Problem 7.18
 * due date: March 9, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 4 -  Problem 7.8 Bubble sort
 */
import java.util.Scanner;

public class Lab4_prob4 {
  public static void main(String[] args) {
    
    System.out.println("Enter 10 numbers to be bubble sorted: ");
    Scanner input = new Scanner(System.in);
    double[] numbers = new double[10];
    
    for (int k = 0; k < numbers.length; k++)
      numbers[k] = input.nextDouble();
    
    for (int l = 0; l < numbers.length; l++) {
      for (int k = 0; k < numbers.length - 1; k++) {
        if (numbers[k] > numbers[k+1])
          swap(numbers, k, k+1);
      }
    }
    
    for (int i = 0; i < numbers.length; i++)
      System.out.println(numbers[i] + " ");
  }
  
  static void swap(double[] arr, int idx1, int idx2) {
    double tmp = arr[idx1];
    arr[idx1] = arr[idx2];
    arr[idx2] = tmp;
  }
}
    
    