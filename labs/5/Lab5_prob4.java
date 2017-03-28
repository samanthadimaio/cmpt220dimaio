/**
 * file: Lab5_prob1
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 5 Problem 8.13
 * due date: March 30, 2017
 * version: 1.8
 *
 * This file contains Lab 5 Problem 8.13 - Locating Largest Element of Array
 */
import java.util.Scanner;
public class Lab5_prob4 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number of rows and columns of an array: ");
    int r = input.nextInt();
    int c = input.nextInt();
      
    double[][] array = new double[r][c];
      
    System.out.println("Enter the array: ");
    for (int x = 0; x < array.length; x++) {
      for (int y = 0; y < array[x].length; y++) {
        array[x][y] = input.nextDouble();
      }
    }
      
      int[] location = locateLargest(array);
      
      System.out.println("Location of largest element of array is at (" + location[0] + " , " + location [1] + ")");
   }
      
  public static int[] locateLargest(double[][] array) {
    int[] location = new int[2];
    double element = array[0][0]; // declare largest element
    
    for (int x = 0; x < array.length; x++) {
      for (int y = 0; y < array[x].length; y++) {  
        if (array[x][y] > element) {
          location[0] = x;                // goes through for loop to find largest element 
          location[1] = y; 
          element = array[x][y];  //places largest element location row/column
        }
      }
    }
    return location;
  }
}
      
    
    

