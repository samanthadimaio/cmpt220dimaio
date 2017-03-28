/**
 * file: Lab5_prob1
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 5 Problem 7.20
 * due date: March 30, 2017
 * version: 1.8
 *
 * This file contains Lab 5 Problem 7.20 - Revise Sort Selection
 */
import java.util.Scanner;

public class Lab5_prob1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] integers = new double[10];
    
    int k;
    for (k = 0; k < integers.length; k++) {  //input list values
      integers[k] = input.nextDouble();
    }
    
    double[] answer = selectionSort(integers);
    
    for (k = 0; k < answer.length; k++) {
      System.out.print((Math.round(answer[k])) + " "); //print list values
    }
    System.out.println();
  }
    

  public static double[] selectionSort(double[] list) {
    for (int i = list.length - 1; i >= 0; i--) {  //going through index backwards
      double currentMax = list[i];
      int currentMaxIndex = i;
      
      for (int j = i - 1; j >= 0; j--) {   //revision (subtract index to see if currMax is less than
        if (currentMax < list[j]) {                           //the value before)
          currentMax = list[j];
          currentMaxIndex = j;
        }
      }
          
      if (currentMaxIndex != i) {
          list[currentMaxIndex] = list[i];
          list[i] = currentMax;
      }
    }
    return list; 
  }
}