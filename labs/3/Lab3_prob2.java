/**
 * file: Lab3_prob2
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 3: Problem 5.7
 * due date: February 23, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 3 - Problem 5.7 - Tuition in 10 Years Calculation
 */
public class Lab3_prob2{
  public static void main(String[] args){
  
    int tuition = 10000;
    int total = 0;
    int tuitionTen = 0;
    
    for (int year = 1; year <= 14; year ++) {
      tuition += (tuition * 0.05);
      if (year == 10)
        tuitionTen = tuition;
      if (year > 10)
        total += tuition;      
    }
    
    System.out.println("Tuition in 10 years: $" + tuitionTen);
    System.out.println("Cost of 4 Years of Tuition After 10 Years: $" + total);
  }
}
    
    