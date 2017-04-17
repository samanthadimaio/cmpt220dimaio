/**
 * file: Lab6_prob2
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 6 Problem 9.13
 * due date: April 19
 * version: 1.8
 *
 * This file contains Lab 5 Problem 9.13 - Test Program for Location - Locate Largest Element
 */
import java.util.Scanner;

public class Lab6_prob2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number of rows and columns of an array: ");
    int r = input.nextInt();                     //get dimensions
    int c = input.nextInt();
    
    double[][] array = new double[r][c];
    
    System.out.println("Enter the array: ");
    
    for (int x = 0; x < array.length; x++) {
      for (int y = 0; y < array[x].length; y++) {             //make matrix
        array[x][y] = input.nextDouble();
      }
    }
    
    Location largest = new Location(array);
    
    System.out.println("Location of largest element of array is " + largest.maxValue + " at (" + largest.row + " , " + largest.column + ")");
  }
}
    
    