/**
 * file: Driver_Lab3
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 3: Problem 6.3
 * due date: February 23, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 3 - Kattis Problem Distance between points
 * 
 */
import java.util.Scanner;

public class Driver_Lab3 { 
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
   
    double x1;
    double x2;
    double y1;
    double y2;
    double p;
    
    double distance;
    int testcase = 0;
   
    while (testcase <= 1000) {
      System.out.print("Enter the coordinates & value of p to calculate the p-norm distance between a pair of points " +
                       "\nExample Entry: (x1  x2  y1  y2  p) --> (1.0 1.0 2.0 2.0 2.0) *Stops when entry is 0* :");
      x1 = input.nextDouble();
      if (x1 == 0)
        break;
      y1 = input.nextDouble();
      x2 = input.nextDouble();
      y2 = input.nextDouble();
      p = input.nextDouble();
    
      if (x1 != 0){
        if ((x1 > 0 && x1 <= 100) && (x2 > 0 && x2 <= 100) 
          && (y1 > 0 && y1 <= 100) && (y2 > 0 && y2 <= 100) && (p > 0 && p <= 100)){
           
          distance = Math.pow(Math.pow((Math.abs(x1-x2)),p) + Math.pow((Math.abs(y1-y2)),p),(1/p));
          
          System.out.printf("Distance is: %.10f\n", distance); 
	      testcase++;
	    }
      }
      else {
        break;
	  }
	}
  }
}
	  
	
     
   
   
   